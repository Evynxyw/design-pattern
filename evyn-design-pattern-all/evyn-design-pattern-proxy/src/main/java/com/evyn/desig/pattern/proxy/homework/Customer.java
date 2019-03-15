package com.evyn.desig.pattern.proxy.homework;

/**
 * @ClassName Customer
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 19:02
 * @Version 1.0
 */
public class Customer implements IBuyHouse {
    @Override
    public void buy() {
        System.out.println("客户买房");
    }
}
