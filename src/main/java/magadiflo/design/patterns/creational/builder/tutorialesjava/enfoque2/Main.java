package magadiflo.design.patterns.creational.builder.tutorialesjava.enfoque2;

public class Main {
    public static void main(String[] args) {
        User.UserBuilder userBuilder = User.builder();
        userBuilder.name("Nophy");
        userBuilder.username("dog");
        userBuilder.password("12345");
        userBuilder.edad(4);
        User u1 = userBuilder.build();
        System.out.println(u1);

        User u2 = User.builder()
                .name("Nophy")
                .username("dog")
                .password("12345")
                .edad(4)
                .build();
        System.out.println(u2);
    }
}
