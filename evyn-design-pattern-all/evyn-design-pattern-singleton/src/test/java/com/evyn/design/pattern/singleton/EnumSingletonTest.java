package com.evyn.design.pattern.singleton;

import com.evyn.design.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * @ClassName EnumSingletonTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 21:22
 * @Version 1.0
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
       Class<?> clazz = EnumSingleton.class;
        try {
            Constructor c = clazz.getDeclaredConstructor(String.class, Integer.class);
            c.setAccessible(true);
            EnumSingleton obj = (EnumSingleton) c.newInstance();
            System.out.println(obj);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
