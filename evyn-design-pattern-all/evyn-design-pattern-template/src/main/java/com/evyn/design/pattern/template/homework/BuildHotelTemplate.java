package com.evyn.design.pattern.template.homework;

/**
 * @ClassName BuildHotelTemplate
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 13:19
 * @Version 1.0
 */
public abstract class BuildHotelTemplate {
    protected BuildHotelTemplate(String name){
        this.name = name;
    }

    protected String name;

    protected abstract void buildDoor();

    protected abstract void buildWindow();

    protected abstract void buildWall();

    protected abstract void buildBase();

    //公共逻辑
    public final void buildHouse(){

        buildBase();
        buildWall();
        buildDoor();
        buildWindow();

    }
}
