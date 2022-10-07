package com.ngcb.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.MODULE,ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {
    String message() default "No Message";

}
