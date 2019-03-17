package com.evyn.design.pattern.template.homework;

/**
 * @ClassName HotelA
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 13:34
 * @Version 1.0
 */
public class HotelA extends BuildHotelTemplate {
    protected HotelA(String name) {
        super(name);
    }

    @Override
    protected void buildDoor() {
        System.out.println(name +"的门要采用防盗门");
    }

    @Override
    protected void buildWindow() {
        System.out.println(name + "的窗户要面向北方");
    }

    @Override
    protected void buildWall() {
        System.out.println(name + "的墙使用大理石建造");
    }

    @Override
    protected void buildBase() {
        System.out.println(name + "的地基使用钢铁地基");
    }
}
