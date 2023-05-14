package dto;

public class Main {
    public static void main(String[] args) {
        User user = new User("ksemeikina", "psRt23_@", 1499070300000L);
        System.out.println(user);
        UserMapper userMapper = new UserMapper();
        UserDTO userDTO = userMapper.UserToUserDTO(user);
        System.out.println(userDTO);

    }
}
