package builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        UserBuilder builder = new UserBuilder();
        director.buildSimpleUser(builder);
        User userFull = builder.build();
        System.out.println(userFull);

        UserBuilder builder2 = new UserBuilder();
        director.buildWithoutPasswordUser(builder2);
        User userWithoutPassword = builder2.build();
        System.out.println(userWithoutPassword);

        UserBuilder builder3 = new UserBuilder();
        director.buildAnonymousUser(builder3);
        User anonymousUser = builder3.build();
        System.out.println(anonymousUser);
    }
}
