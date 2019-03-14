package com.evyn.design.pattern.strategy.promotion;

/**
 * @ClassName EmptyStrategy
 * @Description:
 * @Author xyw
 * @Date 2019/3/13 21:13
 * @Version 1.0
 */
public class EmptyStrategy implements  PromotionStrategy{

    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
