package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Smell {

    public Object haha(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("hahahaha"+proceed);

        return proceed;
    }
}
