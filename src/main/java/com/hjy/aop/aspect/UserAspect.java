package com.hjy.aop.aspect;

import org.aopalliance.intercept.MethodInterceptor;

public class UserAspect{
    public void check(){
        System.out.println("方法前check校验操作。");
    }
    public void log(){
        System.out.println("方法后log日志处理操作。");
    }
}
