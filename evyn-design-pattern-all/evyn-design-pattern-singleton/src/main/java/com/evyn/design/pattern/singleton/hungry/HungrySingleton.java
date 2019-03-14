package com.evyn.design.pattern.singleton.hungry;

/**
 * @ClassName HungrySingleton
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 20:16
 * @Version 1.0
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton() {
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }


}
