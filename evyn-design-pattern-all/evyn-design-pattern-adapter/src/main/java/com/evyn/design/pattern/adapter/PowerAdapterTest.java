package com.evyn.design.pattern.adapter;

/**
 * @ClassName PowerAdapterTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 21:16
 * @Version 1.0
 */
public class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outoupDC5V();
    }
}
