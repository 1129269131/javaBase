package com.koala.javaBase.senior.day11;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Create by koala on 2021-01-02
 */
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnotation06 {

    String value() default "hello";

}
