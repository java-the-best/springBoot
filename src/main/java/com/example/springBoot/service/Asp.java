package com.example.springBoot.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Asp {

  @Around("execution(* com.example.springBoot.service.Test2Impl.m(..))")
  public String around(ProceedingJoinPoint joinPoint) {
    String s = "";
    try {
      s += "a\n";
      s += (String) joinPoint.proceed();
      s += "\naf";
    } catch (Throwable e) {
      e.printStackTrace();
    }
    return s;
  }
}
