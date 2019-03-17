package com.evyn.design.pattern.template.homework;

/**
 * @ClassName HotelA
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 13:34
 * @Version 1.0
 */
public class HotelB extends BuildHotelTemplate {
    protected HotelB(String name) {
        super(name);
    }

    @Override
    protected void buildDoor() {
        System.out.println(name + "的门采用木门");
    }

    @Override
    protected void buildWindow() {
        System.out.println(name + "的窗户要向南");
    }

    @Override
    protected void buildWall() {
        System.out.println(name + "的墙使用玻璃制造");
    }

    @Override
    protected void buildBase() {
        System.out.println(name + "的地基使用花岗岩");
    }
}
