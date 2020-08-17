package com.java.common.constants;

/**
 * @description: Constantes de la aplicacion.
 * @author: Felipe Monzón
 * @date: Aug 4, 2020
 * @version: 1.0.0
 */
public class Constants {
  /**
   * The Constant POINT_CUT_HANDLED_ANNOTATION.
   */
  public static final String POINT_CUT_HANDLED_ANNOTATION =
      "@annotation(com.java.library.annotation.LogExecutionTime)";
  /**
   * Etiqueta para el log info.
   */
  public static final String TIME_LABEL = "TIME ELAPSED {}";
  /**
   * Etiqueta para el log info cuando hay error.
   */
  public static final String ERROR_LABEL = "Error {}";

  /**
   * Constructor de la clase.
   */
  private Constants() {}
}
