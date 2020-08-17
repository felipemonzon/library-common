package com.java.common.aspect;

import com.java.common.annotation.LogExecutionTime;
import com.java.common.component.TimerProcedureLogger;
import com.java.common.constants.Constants;

import lombok.extern.slf4j.Slf4j;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @description: funcionalidad del aspecto.
 * @author: Felipe Monzón
 * @date: Aug 5, 2020
 * @enterprise: Coppel DSB III
 * @version: 1.0.0
 */
@Slf4j
@Aspect
@Component
public class ExecutionTimeAspect {
  /**
   * Punto de corte para medir el tiempo en los metodos de la aplicacion.
   * 
   * @param joinPoint proceso del punto de corte
   * @return objeto con el punto de corte procesado
   */
  @Around(value = "@annotation(com.java.common.annotation.LogExecutionTime)")
  public Object execute(ProceedingJoinPoint pjp) throws Throwable {
    LogExecutionTime timerProcedure =
        ((MethodSignature) pjp.getSignature()).getMethod().getAnnotation(LogExecutionTime.class);
    TimerProcedureLogger transactionLogger = new TimerProcedureLogger(timerProcedure.name());
    Object response = pjp.proceed();
    try {
      response = pjp.proceed();
      log.info(Constants.TIME_LABEL, transactionLogger);
    } catch (Throwable e) {
      log.error(Constants.ERROR_LABEL, e.getMessage(), e);
      log.info(Constants.TIME_LABEL, transactionLogger);
    }
    return response;
  }
}
