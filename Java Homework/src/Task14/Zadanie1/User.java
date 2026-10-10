package Task14.Zadanie1;

import lombok.ToString;
import lombok.Value;

@Value
public class User {

    @PasswordValidation(minLength = 10, requireSpecialChar = true)
    @ToString.Exclude
    String password;
}