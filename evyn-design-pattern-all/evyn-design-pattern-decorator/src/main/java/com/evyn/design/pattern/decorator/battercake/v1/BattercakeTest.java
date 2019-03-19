package com.evyn.design.pattern.decorator.battercake.v1;

/**
 * @ClassName BattercakeTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 20:13
 * @Version 1.0
 */
public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + ",总价格："
                + battercake.price());

        Battercake battercake1 = new BattercakeWithEage();
        System.out.println(battercake1.getMsg() + ",总价格："
                + battercake1.price());


        Battercake battercake2 = new BattercakeWithEageAndSausage();
        System.out.println(battercake2.getMsg() + ",总价格："
                + battercake2.price());
    }
}
