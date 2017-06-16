package com.gduf.spring_aop_hand;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * Created by thz on 2017/6/6.
 */
public class MyAspect implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("前方法");
        //手动执行目标方法
        Object object=methodInvocation.proceed();
        System.out.println("后方法");
        return object;
    }

}
