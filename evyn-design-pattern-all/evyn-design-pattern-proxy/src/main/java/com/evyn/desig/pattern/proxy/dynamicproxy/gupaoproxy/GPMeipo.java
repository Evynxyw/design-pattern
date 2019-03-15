package com.evyn.desig.pattern.proxy.dynamicproxy.gupaoproxy;

import com.evyn.desig.pattern.proxy.staticproxy.Person;

import java.lang.reflect.Method;

/**
 * @ClassName Meipo
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 21:27
 * @Version 1.0
 */
public class GPMeipo implements GPInvocationHandler {

    private Object target;

    public Object getInstance(Object person){
        this.target = person;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
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
