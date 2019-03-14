package com.evyn.design.pattern.strategy.promotion;


import com.sun.deploy.util.StringUtils;

/**
 * @ClassName PromotionActivityTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/13 21:19
 * @Version 1.0
 */
public class PromotionActivityTest {
    public static void main(String[] args) {
        test1();
        System.out.println("-------------------------------------");
        test3();
    }

    public static void test1(){
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity activity11 = new PromotionActivity(new CashBackStrategy());

        activity618.execute();
        activity11.execute();
    }

    public static void test3(){
        String key = "CASHBACK";
        PromotionActivity activity =
                new PromotionActivity(
                        PromotionStrageFactory.getPromotionStrategy(key));
        activity.execute();
    }



}
