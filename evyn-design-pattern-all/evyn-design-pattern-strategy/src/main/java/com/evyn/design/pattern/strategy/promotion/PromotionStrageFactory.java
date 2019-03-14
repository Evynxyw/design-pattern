package com.evyn.design.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PromotionStrageFactory
 * @Description:
 * @Author xyw
 * @Date 2019/3/13 21:28
 * @Version 1.0
 */
public class PromotionStrageFactory {

    private static Map<String, PromotionStrategy> promotionStrategyMap =
            new HashMap<String, PromotionStrategy>();

    static {
        promotionStrategyMap.put(PromotionKey.COUPON, new CouponStrategy());
        promotionStrategyMap.put(PromotionKey.CASHBACK, new CashBackStrategy());
        promotionStrategyMap.put(PromotionKey.GROUPBUY, new GroupBuyStrategy());
    }

    private PromotionStrageFactory() {
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();

    public static PromotionStrategy getPromotionStrategy(String key){
        PromotionStrategy promotionStrategy = promotionStrategyMap.get(key);

        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }
}
