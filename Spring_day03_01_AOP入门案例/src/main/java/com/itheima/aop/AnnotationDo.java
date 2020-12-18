package com.itheima.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AnnotationDo {

    @Pointcut("execution(* *..*(..))")
    public void pt(){}


    @Before("pt()")
    public void before(){
        System.out.println("我是before");
    }
    public void after(){}
    public void afterRetruning(){}
    public void afterThorwing(){}
    public void around(){}
}
