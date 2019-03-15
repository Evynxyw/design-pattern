package com.evyn.desig.pattern.proxy.homework;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName WaWoJiaProxy
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 19:22
 * @Version 1.0
 */
public class WaWoJiaProxy implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object object){
        Class<?> clazz = object.getClass();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object res = methodProxy.invokeSuper(o, objects);
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
