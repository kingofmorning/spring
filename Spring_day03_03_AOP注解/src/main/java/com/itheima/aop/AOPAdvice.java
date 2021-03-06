package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class AOPAdvice {

//    @Pointcut("execution(* *..*(..))")
//    public void pt(){}

//    @Before("AOPPointcut.pt1()")
//    public void before(){
//        System.out.println("前置before...");
//    }
//
//    @After("AOPPointcut.pt1()")
//    public void after(){
//        System.out.println("后置after...");
//    }

 /*   @AfterReturning(value = "AOPPointcut.pt1()",returning = "ret")
    public void afterReturing(Object ret){
        System.out.println("这是"+ret);
        System.out.println("返回后afterReturing...");
    }*/
//
//    @AfterThrowing("AOPPointcut.pt1()")
//    public void afterThrowing(){
//        System.out.println("抛出异常后afterThrowing...");
//    }

   @Around("AOPPointcut.pt1()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
      System.out.println("环绕前around before...");
       Object ret = pjp.proceed();
       System.out.println("这是ret"+ret);
      System.out.println("环绕后around after...");
        return 200;
    }

  /*  @Before("AOPPointcut.pt1()")
    public void aop002log(){
        System.out.println("前置before...1");
    }*/

//    @Before("AOPPointcut.pt1()")
//    public void aop002exception(){
//        System.out.println("前置before...2");
//    }

}
