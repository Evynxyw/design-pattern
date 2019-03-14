package com.evyn.design.pattern.prototype.simple;

/**
 * @ClassName Client
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 20:17
 * @Version 1.0
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concreteprototype){
        return concreteprototype.clone();
    }
}
