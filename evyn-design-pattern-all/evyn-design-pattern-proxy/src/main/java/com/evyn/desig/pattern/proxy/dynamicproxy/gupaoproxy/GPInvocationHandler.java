package com.evyn.desig.pattern.proxy.dynamicproxy.gupaoproxy;

import java.lang.reflect.Method;

/**
 * @ClassName GPInvocationHandler
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 21:43
 * @Version 1.0
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
