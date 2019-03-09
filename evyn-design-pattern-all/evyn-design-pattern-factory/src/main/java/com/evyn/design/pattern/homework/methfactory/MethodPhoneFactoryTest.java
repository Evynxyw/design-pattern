package com.evyn.design.pattern.homework.methfactory;

import com.evyn.design.pattern.homework.phone.MobilePhone;

/**
 * @ClassName MethodPhoneFactoryTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 18:16
 * @Version 1.0
 */
public class MethodPhoneFactoryTest {
    public static void main(String[] args) {
        MobilePhoneFactory appleFactory = new ApplePhoneFactory();
        MobilePhone applePhone = appleFactory.generatePhone();
        applePhone.call();

        MobilePhoneFactory xmFactory = new XMPhoneFactory();
        MobilePhone xmPhone = xmFactory.generatePhone();
        xmPhone.call();

        MobilePhoneFactory nokiaFactory = new NokiaPhoneFactory();
        MobilePhone nokiaPhone = nokiaFactory.generatePhone();
        nokiaPhone.call();
    }
}
