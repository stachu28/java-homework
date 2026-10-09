package Task14;

import lombok.ToString;
import lombok.Value;

@Value
public class User {

    @PasswordValidation(minLength = 10, requireDigit = true, requireSpecialChar = true)
    @ToString.Exclude
    String password;
}