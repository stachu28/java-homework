package Task14.Zadanie1;

import lombok.*;

import java.util.List;

@Value
@Builder(toBuilder = true, builderMethodName = "build", buildMethodName = "building")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {
    @EqualsAndHashCode.Include
    String login;

    @PasswordValidation(minLength = 10, requireSpecialChar = true)
    @ToString.Exclude
    String password;

    @Singular("rola")
    List<String> role;
}