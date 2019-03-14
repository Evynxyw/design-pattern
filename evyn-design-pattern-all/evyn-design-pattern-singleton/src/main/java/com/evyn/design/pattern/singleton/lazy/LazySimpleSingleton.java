package com.evyn.design.pattern.singleton.lazy;

/**
 * @ClassName LazySimpleSingleton
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 20:22
 * @Version 1.0
 */
public class LazySimpleSingleton {
    private static  LazySimpleSingleton lazy = null;

    private LazySimpleSingleton() {
    }

    // 容易出现死锁
    public synchronized static LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
