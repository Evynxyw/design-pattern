package com.evyn.design.pattern.decorator.battercake.v2;

/**
 * @ClassName BaseBaaercake
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 20:19
 * @Version 1.0
 */
public class BaseBaaercake extends Battercake{
    public String getMsg(){
        return "煎饼";
    }
    public int price(){
        return 5;
    }
}
