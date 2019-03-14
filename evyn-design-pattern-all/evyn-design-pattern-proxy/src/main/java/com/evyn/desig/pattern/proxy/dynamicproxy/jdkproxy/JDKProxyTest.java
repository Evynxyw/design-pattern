package com.evyn.desig.pattern.proxy.dynamicproxy.jdkproxy;

import com.evyn.desig.pattern.proxy.staticproxy.Person;

/**
 * @ClassName JDKProxyTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 21:31
 * @Version 1.0
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person) new Meipo().getinstance(new Girl());
            obj.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
