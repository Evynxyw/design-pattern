package com.evyn.design.pattern.strategy.promotion;

/**
 * @ClassName CashBackStrategy
 * @Description:
 * @Author xyw
 * @Date 2019/3/13 21:15
 * @Version 1.0
 */
public class CashBackStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("返回促销，返回金额直接转到支付宝");
    }
}
