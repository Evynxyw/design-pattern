package com.evyn.design.pattern.singleton.lazy;

/**
 * @ClassName LazyDoubleCheckSingleton
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 20:38
 * @Version 1.0
 */
public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {
    }

    //适中的方案
    //双重检查锁
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
