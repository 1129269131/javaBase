package senior.day11;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * Create by koala on 2021-01-02
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
public @interface MyAnnotation03 {

    String value() default "hello";

}
