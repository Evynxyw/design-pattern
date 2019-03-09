package com.evyn.design.pattern.strategy.payport;

import com.evyn.design.pattern.strategy.PayState;

/**
 * @ClassName Payment
 * @Description:
 * @Author xyw
 * @Date 2019/1/20 11:27
 * @Version 1.0
 */
public interface Payment {

    public PayState pay(String uid, double amount);
}
