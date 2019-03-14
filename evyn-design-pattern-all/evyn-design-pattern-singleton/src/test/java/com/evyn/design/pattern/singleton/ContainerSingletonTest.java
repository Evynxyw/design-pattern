package com.evyn.design.pattern.singleton;

import com.evyn.design.pattern.singleton.register.ContainerSingleton;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName ContainerSingletonTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 21:48
 * @Version 1.0
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {
       Object singleton = (ContainerSingleton) ContainerSingleton.getBean(ContainerSingleton.class.getName());
       System.out.println(singleton);

        CountDownLatch downLatch = new CountDownLatch(6);

        try {

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
