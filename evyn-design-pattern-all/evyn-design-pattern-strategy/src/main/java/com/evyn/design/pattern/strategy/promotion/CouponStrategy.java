package com.evyn.design.pattern.strategy.promotion;

/**
 * @ClassName CouponStrategy
 * @Description:
 * @Author xyw
 * @Date 2019/3/13 21:14
 * @Version 1.0
 */
public class CouponStrategy implements  PromotionStrategy {
    public void doPromotion() {
        System.out.println("领取优惠券，课程价格直接减去优惠券面值");

    }
}
