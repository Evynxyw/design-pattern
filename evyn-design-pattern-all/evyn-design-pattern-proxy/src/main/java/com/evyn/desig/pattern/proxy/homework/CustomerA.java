package com.evyn.desig.pattern.proxy.homework;

/**
 * @ClassName CustomerA
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 19:10
 * @Version 1.0
 */
public class CustomerA {

    public static void main(String[] args) {
        IBuyHouse c = (IBuyHouse) new LianjiaProxy().getInstance(new Customer());
        c.buy();
    }
}
