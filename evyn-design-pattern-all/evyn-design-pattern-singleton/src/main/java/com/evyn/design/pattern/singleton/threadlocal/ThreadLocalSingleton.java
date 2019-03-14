package com.evyn.design.pattern.singleton.threadlocal;

/**
 * @ClassName ThreadLocalSingleton
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 21:56
 * @Version 1.0
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

}
