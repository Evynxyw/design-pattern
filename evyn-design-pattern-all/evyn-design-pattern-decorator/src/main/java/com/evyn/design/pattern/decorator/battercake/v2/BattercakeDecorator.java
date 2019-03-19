package com.evyn.design.pattern.decorator.battercake.v2;

/**
 * @ClassName BattercakeDecorator
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 20:20
 * @Version 1.0
 */
public abstract class BattercakeDecorator extends Battercake{
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    public String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    public int price() {
        return this.battercake.price();
    }
}
