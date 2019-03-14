package com.evyn.design.pattern.singleton;

import com.evyn.design.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @ClassName LazyInnerClassSingletonTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 20:57
 * @Version 1.0
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);//强吻，为了调用私有构造方法。进行授权
            Object o1 = c.newInstance();
            Object o2 = LazyInnerClassSingleton.getInstance();
            System.out.println(o1 == o2);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
