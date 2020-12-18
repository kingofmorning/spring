package com.itheima.aop;
//1.制作通知类，在类中定义一个方法用于完成共性功能
public class AOPAdvice {

    public int function(Throwable t){
        System.out.println("共性功能");


        return 99;
    }
}
