package com.evyn.design.pattern.adapter.v2;

/**
 * @ClassName PasspordTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 13:09
 * @Version 1.0
 */
public class PasspordTest {

    public static void main(String[] args) {
        IPassportForThird third = new PasspordForThreeAdapter();
        third.loginForQQ("22222");
    }
}
