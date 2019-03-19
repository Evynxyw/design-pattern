package com.evyn.design.pattern.decorator.battercake.v1;

/**
 * @ClassName BattercakeWithEage
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 20:11
 * @Version 1.0
 */
public class BattercakeWithEage extends Battercake{
    @Override
    public String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    public int price() {
        return super.price() + 1;
    }
}
