package com.gduf.spring_aspect_xml;


import org.aspectj.lang.JoinPoint;

/**
 * Created by thz on 2017/6/12.
 */
public class MyAspect {
//    joinpoint 用来描述切入点（即目标方法），获取目标方法的方法名等
    public void before(JoinPoint joinpoint){
        System.out.println("前置通知："+joinpoint.getSignature().getName());
    }

}
