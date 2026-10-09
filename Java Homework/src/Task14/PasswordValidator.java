package Task14;

import java.lang.reflect.Field;

public class PasswordValidator {

    private PasswordValidator() {
    }

    public static boolean validate(Object obj) {
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
                return false;
            }
        }
        return true;
    }
}