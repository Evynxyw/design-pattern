package com.evyn.desig.pattern.proxy.homework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName LianjiaProxy
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 19:03
 * @Version 1.0
 */
public class LianjiaProxy implements InvocationHandler {

    private Object target;


    public Object getInstance(Object customer){
        this.target = customer;
        Class<?> clazz = customer.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object res = method.invoke(this.target, args);
        after();
        return res;
    }

    private void before(){
        System.out.println("链家房源信息如下.......");
    }

    private void after(){
        System.out.println("客户看房结果");
    }
}
