package com.hjy.aop.proxy;


import com.hjy.aop.aspect.UserAspect;
import com.hjy.aop.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserProxy implements InvocationHandler {
    private UserDao userDao;
    public Object createProxy(UserDao userDao){
        this.userDao=userDao;
        ClassLoader classLoader = UserProxy.class.getClassLoader();
        Class[] functions=userDao.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader,functions,this);
    }
    public Object invoke(Object Proxy, Method method, Object[] args) throws Throwable {
        UserAspect userAspect = new UserAspect();
        userAspect.check();
        Object invoke = method.invoke(userDao, args);
        userAspect.log();
        return invoke;
    }
}
