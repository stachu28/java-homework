package Task14.Zadanie1;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import java.lang.reflect.Field;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PasswordValidator {

    public static boolean validate(Object obj) {
        boolean result = check(obj);
        log.info("Validation result: " + (result ? "OK" : "ERROR"));
        return result;
    }

    public static boolean check(Object obj) {
        if (obj == null) {
            return false;
        }

        for (Field field : obj.getClass().getDeclaredFields()) {
            if (!field.isAnnotationPresent(PasswordValidation.class))
                continue;
            PasswordValidation rule = field.getAnnotation(PasswordValidation.class);
            field.setAccessible(true);

            try {
                if (!(field.get(obj) instanceof String password))
                    return false;
                if (password.length() < rule.minLength())
                    return false;
                if (rule.requireDigit() && password.chars().noneMatch(Character::isDigit))
                    return false;
                if (rule.requireSpecialChar() && password.chars().allMatch(Character::isLetterOrDigit))
                    return false;
            } catch (IllegalAccessException e) {
                log.warning("No access to that field: " + e.getMessage());
                return false;
            }
        }
        return true;
    }
}