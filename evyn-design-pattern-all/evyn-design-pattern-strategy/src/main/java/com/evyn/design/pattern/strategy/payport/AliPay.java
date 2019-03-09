package com.evyn.design.pattern.strategy.payport;

import com.evyn.design.pattern.strategy.PayState;

/**
 * @ClassName AliPay
 * @Description:
 * @Author xyw
 * @Date 2019/1/20 11:27
 * @Version 1.0
 */
public class AliPay implements Payment{

    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用支付宝");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200,"支付成功",amount);
    }
}
