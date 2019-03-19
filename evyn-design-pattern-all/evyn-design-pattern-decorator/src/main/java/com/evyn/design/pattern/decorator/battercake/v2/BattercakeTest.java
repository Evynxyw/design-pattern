package com.evyn.design.pattern.decorator.battercake.v2;

/**
 * @ClassName BattercakeTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 20:25
 * @Version 1.0
 */
public class BattercakeTest {

    public static void main(String[] args) {
        Battercake battercake;
        battercake = new BaseBaaercake();
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getMsg() + ",总价格：" +
                battercake.price());
    }
}
