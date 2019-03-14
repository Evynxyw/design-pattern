package com.evyn.design.pattern.singleton.register;

/**
 * @ClassName EnumSingleton
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 21:20
 * @Version 1.0
 */
public enum  EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
