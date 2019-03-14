package com.evyn.design.pattern.singleton;

import com.evyn.design.pattern.singleton.lazy.ExecutorThread;

/**
 * @ClassName LazySingletonTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 20:23
 * @Version 1.0
 */
public class LazySingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();
        System.out.println("Exector end");
    }
}
