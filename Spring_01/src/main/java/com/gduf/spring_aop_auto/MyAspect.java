package com.gduf.spring_aop_auto;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by thz on 2017/6/6.
 */
public class MyAspect implements MethodInterceptor {
//类似于struts2的拦截器

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("前方法");
        Object object=methodInvocation.proceed();
        System.out.println("后方法");
        return object;
    }
}
