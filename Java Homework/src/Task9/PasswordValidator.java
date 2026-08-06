package Task9;

public final class PasswordValidator {
    private PasswordValidator() {}

    public static void validate(String pwd) {
        if (pwd == null || pwd.length() < 8) {
            throw new IllegalArgumentException("length<8");
        }
        for (char c : pwd.toCharArray()) {
            if (Character.isDigit(c)) {
                return;
            }
        }
        throw new IllegalArgumentException("no digit");
    }
}