package com.example.springcustomannotation.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Custom annotation which will be used to annotate classes required for Bing
 * Service
 * 
 * @author Sujan Sen
 *
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface Bing {

}
