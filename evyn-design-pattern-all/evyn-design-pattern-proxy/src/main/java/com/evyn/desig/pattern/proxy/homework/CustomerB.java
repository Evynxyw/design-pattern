package com.evyn.desig.pattern.proxy.homework;

/**
 * @ClassName CustomerB
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 19:26
 * @Version 1.0
 */
public class CustomerB {

    public static void main(String[] args) {
        CustomerC CustomerC = (com.evyn.desig.pattern.proxy.homework.CustomerC) new WaWoJiaProxy().getInstance(new CustomerC());
        CustomerC.buy();
    }
}
