package com.evyn.design.pattern.strategy.payport.pay;

import com.evyn.design.pattern.strategy.payport.MsgResult;

/**
 * @ClassName Payment
 * @Description:
 * @Author xyw
 * @Date 2019/1/20 11:27
 * @Version 1.0
 */
public abstract class Payment {

    //支付类型
    public abstract String getName();

    //查询余额
    protected abstract double queryBalance(String uid);

    //扣款支付
    public MsgResult pay(String uid, double amount) {
        if(queryBalance(uid) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额：" + amount);
    }
}
