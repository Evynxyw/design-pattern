package com.evyn.design.pattern.strategy.payport.pay;

/**
 * @ClassName AliPay
 * @Description:
 * @Author xyw
 * @Date 2019/1/20 11:27
 * @Version 1.0
 */
public class AliPay extends Payment{

    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }
}
