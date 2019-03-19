package com.evyn.design.pattern.decorator.battercake.v1;

/**
 * @ClassName BattercakeWithEageAndSausage
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 20:12
 * @Version 1.0
 */
public class BattercakeWithEageAndSausage extends BattercakeWithEage{
    @Override
    public String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    public int price() {
        return super.price() + 2;
    }
}
