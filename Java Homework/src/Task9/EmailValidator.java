package Task9;

import java.util.regex.Pattern;

public final class EmailValidator {
    private static final Pattern EMAIL = Pattern.compile("^\\S+@\\S+\\.\\S+$");

    public EmailValidator() {
    }

    public static void validate(String email) {
        if (email == null || email.isBlank()) {
            throw new EmailException("email is null");
        }
        if (!EMAIL.matcher(email).matches()) {
            throw new EmailException("invalid format: " + email);
        }
    }
}