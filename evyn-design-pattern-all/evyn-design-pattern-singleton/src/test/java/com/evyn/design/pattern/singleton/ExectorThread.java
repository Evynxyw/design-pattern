package com.evyn.design.pattern.singleton;

import com.evyn.design.pattern.singleton.lazy.LazySimpleSingleton;

/**
 * Created by Tom.
 */
public class ExectorThread implements Runnable{

    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
//        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
