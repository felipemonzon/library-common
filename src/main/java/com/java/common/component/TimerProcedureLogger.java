package com.java.common.component;

import java.time.Duration;
import java.time.Instant;

/**
 * @description: Calcula el tiempo de la transaccion
 * @author: Felipe Monzón
 * @date: Aug 4, 2020
 * @version: 1.0.0
 */
public class TimerProcedureLogger {
  /**
   * Nombre de la transaccion.
   */
  private String transaction;
  /**
   * Inicia el tiempo de la transaccion.
   */
  private Instant start;

  /**
   * Constructor de la clase.
   */
  public TimerProcedureLogger(String transaction) {
    this.transaction = transaction;
    this.start = Instant.now();
  }

  /**
   * Genera la cadena para el log.
   */
  @Override
  public String toString() {
    return new StringBuilder().append(this.transaction).append(", ")
        .append(Duration.between(this.start, Instant.now()).toMillis()).toString();
  }
}
