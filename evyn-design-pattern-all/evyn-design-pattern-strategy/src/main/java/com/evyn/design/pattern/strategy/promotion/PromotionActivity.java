package com.evyn.design.pattern.strategy.promotion;

/**
 * @ClassName PromotionActivity
 * @Description:
 * @Author xyw
 * @Date 2019/3/13 21:17
 * @Version 1.0
 */
public class PromotionActivity {

    PromotionStrategy promotionStrategy;
    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        this.promotionStrategy.doPromotion();
    }
}
