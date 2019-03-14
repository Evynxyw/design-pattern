package com.evyn.design.pattern.singleton;

import com.evyn.design.pattern.singleton.lazy.ExecutorThread;
import com.evyn.design.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @ClassName ThreadLocalSingletonTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 21:59
 * @Version 1.0
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singleton);

                ThreadLocalSingleton singleton1 = ThreadLocalSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singleton1);

                ThreadLocalSingleton singleton2 = ThreadLocalSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singleton2);

                ThreadLocalSingleton singleton3 = ThreadLocalSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singleton3);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singleton);

                ThreadLocalSingleton singleton1 = ThreadLocalSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singleton1);

                ThreadLocalSingleton singleton2 = ThreadLocalSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singleton2);

                ThreadLocalSingleton singleton3 = ThreadLocalSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singleton3);
            }
        });

        t1.start();
        t2.start();
    }
}
