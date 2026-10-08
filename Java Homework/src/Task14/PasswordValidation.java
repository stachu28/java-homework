package Task14;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PasswordValidation {

    int minLength() default 8;

    boolean requireDigit() default true;

    boolean requireSpecialChar() default true;
}