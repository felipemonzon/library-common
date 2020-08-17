package com.java.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description: Clase de arranque.
 * @author: Felipe Monzón
 * @date: Aug 17, 2020
 * @enterprise: Coppel DSB III
 * @version: 1.0.0
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
