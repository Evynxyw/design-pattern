package com.evyn.desig.pattern.proxy.staticproxy;

/**
 * @ClassName FatherProxyTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 21:06
 * @Version 1.0
 */
public class FatherProxyTest {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
