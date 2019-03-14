package com.evyn.design.pattern.singleton.hungry;

/**
 * @ClassName HungrySingleton
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 20:16
 * @Version 1.0
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton() {
    }
    public static HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }

}
