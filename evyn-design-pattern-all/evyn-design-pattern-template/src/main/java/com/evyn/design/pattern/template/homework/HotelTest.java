package com.evyn.design.pattern.template.homework;

/**
 * @ClassName HotelTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 13:36
 * @Version 1.0
 */
public class HotelTest {
    public static void main(String[] args) {
        BuildHotelTemplate hotelA = new HotelA("酒店A");
        hotelA.buildHouse();
        System.out.println("-------------------------------");
        BuildHotelTemplate hotelB = new HotelA("酒店A");
        hotelB.buildHouse();
    }
}
