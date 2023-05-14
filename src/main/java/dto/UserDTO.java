package dto;


import java.util.Objects;

public class UserDTO {

    private String login;

    private Long timestamp;

    public UserDTO() {
    }

    public UserDTO(String login, Long timestamp) {
        this.login = login;
        this.timestamp = timestamp;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(getLogin(), userDTO.getLogin())
                && Objects.equals(getTimestamp(), userDTO.getTimestamp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getTimestamp());
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "login='" + login + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    //simple Builder
    public static class Builder{
        private String login;

        private Long timestamp;
        public Builder login(String login){
            this.login = login;
            return this;
        }

        public Builder timestamp(Long timestamp){
            this.timestamp = timestamp;
            return this;
        }

        public UserDTO build(){
            UserDTO builtUserDTO = new UserDTO();
            builtUserDTO.login = login;
            builtUserDTO.timestamp = timestamp;
            return builtUserDTO;
        }
    }

}
