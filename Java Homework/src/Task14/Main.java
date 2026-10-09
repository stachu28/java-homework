package Task14;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User("password1234!"),
                new User("password1234"),
                new User("password!"),
                new User("pas34!"),
                new User(""),
                new User(null),
        };

        for (User user : users) {
            boolean result = PasswordValidator.validate(user);
            String pwd = String.valueOf(user.getPassword());
            System.out.printf("Password: %-20s -> %s%n", pwd, result ? "Correct" : "Incorrect");
        }
    }
}