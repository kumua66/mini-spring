package com.southwind.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Aspect
public class LoggerAspect {
    @Before("execution(public int com.southwind.aop.CalImpl.*(..))")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法的参数是" + joinPoint.getArgs());
    }
    @AfterReturning(value = "execution(public int com.southwind.aop.CalImpl.*(..))",returning = "result")
    public void after(JoinPoint joinPoint, Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法的返回值是" + result);

    }
}
//aop要在ioc的基础上
