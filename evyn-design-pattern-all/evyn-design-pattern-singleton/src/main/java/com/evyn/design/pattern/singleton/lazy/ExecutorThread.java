package com.evyn.design.pattern.singleton.lazy;

/**
 * @ClassName ExecutorThread
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 20:25
 * @Version 1.0
 */
public class ExecutorThread implements Runnable{
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
