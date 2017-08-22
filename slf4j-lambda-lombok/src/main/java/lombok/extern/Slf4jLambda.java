package lombok.extern;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Causes lombok to generate a {@link kr.pe.kwonnam.slf4jlambda.LambdaLogger} field.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Slf4jLambda {
    /** @return The category of the constructed Logger. By default, it will use the type where the annotation is placed. */
    String topic() default "";
}
