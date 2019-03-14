package com.evyn.design.pattern.singleton.lazy;

/**
 * @ClassName LazyInnerClassSingleton
 * @Description:性能最优的懒汉式写法
 * @Author xyw
 * @Date 2019/3/9 20:49
 * @Version 1.0
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    //LazyHolder里面的逻辑需要等到外部方法调用时才执行
    //利用了内部类的特性
    //避免了线程安全问题
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
