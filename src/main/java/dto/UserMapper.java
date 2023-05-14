package dto;

public class UserMapper {
    public UserDTO UserToUserDTO(User user){
        return new UserDTO.Builder()
                .login(user.getLogin())
                .timestamp(user.getTimestamp())
                .build();
    }
}
