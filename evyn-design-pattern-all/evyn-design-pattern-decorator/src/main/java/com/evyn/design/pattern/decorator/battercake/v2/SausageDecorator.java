package com.evyn.design.pattern.decorator.battercake.v2;

/**
 * @ClassName SausageDecorator
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 20:24
 * @Version 1.0
 */
public class SausageDecorator extends BattercakeDecorator{
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    public int price() {
        return super.price() + 2;
    }
}
