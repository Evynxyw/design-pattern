package com.evyn.design.pattern.strategy.payport.pay;


public class JDPay extends Payment {

    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
