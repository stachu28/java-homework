package Task14.Zadanie1;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                User.create().login("user1").password("password1234!").build(),
                User.create().login("user2").password("password1234").build(),
                User.create().login("user3").password("password!").build(),
                User.create().login("user4").password("pas34!").build(),
                User.create().login("user5").password("").build(),
                User.create().login("user6").password(null).build(),
        };

        System.out.println("---Password Validation Test---");
        for (User user : users) {
            boolean result = PasswordValidator.validate(user);
            String pwd = String.valueOf(user.getPassword());
            System.out.printf("Password: %-20s -> %s%n", pwd, result ? "Correct" : "Incorrect");
        }

        System.out.println("---Lombok Test---");
        User admin = User.create()
                .login("admin")
                .password("password1234!")
                .rola("ADMIN")
                .rola("USER")
                .build();
        System.out.println("toString:       " + admin);
        System.out.println("login:          " + admin.getLogin());
        System.out.println("password:       " + admin.getPassword());
        System.out.println("role:           " + admin.getRole());

        User copy = admin.toBuilder().password("differentpwd1234!").build();
        System.out.println("copy toBuilder: " + copy);
        System.out.println("copy password:  " + copy.getPassword());
        System.out.println("equals:         " + admin.equals(copy));
        System.out.println("hashCode:       " + (admin.hashCode() == copy.hashCode()));
        System.out.println("final class?    " + java.lang.reflect.Modifier.isFinal(User.class.getModifiers()));
    }
}