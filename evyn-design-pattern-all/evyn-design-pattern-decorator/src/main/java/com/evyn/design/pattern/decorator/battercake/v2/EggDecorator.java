package com.evyn.design.pattern.decorator.battercake.v2;

/**
 * @ClassName EggDecorator
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 20:23
 * @Version 1.0
 */
public class EggDecorator extends BattercakeDecorator{

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    public int price() {
        return super.price() + 1;
    }
}
