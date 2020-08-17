package com.java.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description: Anotacion para medir el tiempo.
 * @author: Felipe Monzón
 * @date: Aug 5, 2020
 * @version: 1.0.0
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogExecutionTime {
  /**
   * Descripcion para el mensaje
   */
  String name() default "";
}
