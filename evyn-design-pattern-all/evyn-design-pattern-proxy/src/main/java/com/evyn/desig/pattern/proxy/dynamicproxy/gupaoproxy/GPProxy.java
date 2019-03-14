package com.evyn.desig.pattern.proxy.dynamicproxy.gupaoproxy;

import java.lang.reflect.InvocationHandler;

/**
 * @ClassName GPProxy
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 21:44
 * @Version 1.0
 */
public class GPProxy {

    private static final String LN = "\r\n";

    public static Object newProxyInstance(GPClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
            throws IllegalArgumentException
    {
        try {
            String src = generateSrc(interfaces);
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.evyn.design.pattern.proxy.dynamicproxy.gpproxy;" + LN);
    }
}
