package com.dodo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.dodo.service.*.*(..))")
    public void beforeSendMessage(JoinPoint joinPoint){
        System.out.println("Cathed Parameter Before SendMessage" + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());

    }
    @After("execution(* com.dodo.service.*.*(..))")
    public void afterSendMessage(JoinPoint joinPoint){
        System.out.println("Cathed Parameter After SendMessage" + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}
