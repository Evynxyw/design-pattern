package com.evyn.design.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ContainerSingleton
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 21:44
 * @Version 1.0
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className){
        if(!ioc.containsKey(className)){
            Object obj = null;
            try {
                obj = Class.forName(className);
                ioc.put(className, obj);
                return obj;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
