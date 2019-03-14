package com.evyn.design.pattern.strategy.promotion;

/**
 * @ClassName GroupBuyStrategy
 * @Description:
 * @Author xyw
 * @Date 2019/3/13 21:16
 * @Version 1.0
 */
public class GroupBuyStrategy implements  PromotionStrategy {
    public void doPromotion() {
        System.out.println("拼团促销，满20人成团，全团享受团购价");
    }
}
