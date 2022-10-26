package com.example.demo.chapter03.aop;

import java.text.SimpleDateFormat;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect {
  @Before("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
  public void beforeAdvice(JoinPoint joinPoint) {
    System.out.println("===== Before Advice =====");
    System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
    System.out.println(String.format("メソッド:%s", joinPoint.getSignature().getName()));
  }

  @After("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
  public void afterAdvice(JoinPoint joinPoint) {
    System.out.println("===== After Advice =====");
    System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
    System.out.println(String.format("メソッド:%s", joinPoint.getSignature().getName()));
  }
  
  @Around("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
  public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
    System.out.println("===== Around Advice ===");
    System.out.println("▼▼▼ 前処理 ▼▼▼");
    Object result = joinPoint.proceed();
    System.out.println("===== Around Advice ===");
    System.out.println("▲▲▲ 後処理 ▲▲▲");
    return result;
  }

}
