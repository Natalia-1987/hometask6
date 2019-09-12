import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;

/**
 *
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)

public @interface MyCustomAnnotation {
    int studentAge() default 17;
    String studentSurname();
    String studentAddress();
    String studentStream() default "ECE";
}
