package com.evyn.desig.pattern.proxy.dynamicproxy.jdkproxy;

import com.evyn.desig.pattern.proxy.staticproxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName Meipo
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 21:27
 * @Version 1.0
 */
public class Meipo implements InvocationHandler {

    private Object target;

    public Object getinstance(Object person){
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object obj = method.invoke(target, args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，已经确认你的需求");
        System.out.println("开始无色");
    }

    private void after(){
        System.out.println("OK,准备办事把");
    }
}
