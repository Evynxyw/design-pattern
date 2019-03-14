package com.evyn.desig.pattern.proxy.dynamicproxy.cgliproxy;

/**
 * @ClassName CglibTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/11 21:18
 * @Version 1.0
 */
public class CglibTest {
    public static void main(String[] args) {
        try {
            Customer customer = (Customer)new CGLibMeipo().getInstance(Customer.class);
            customer.findLove();
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
