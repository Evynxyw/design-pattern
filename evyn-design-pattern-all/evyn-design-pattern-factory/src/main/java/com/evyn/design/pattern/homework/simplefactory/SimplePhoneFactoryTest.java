package com.evyn.design.pattern.homework.simplefactory;

import com.evyn.design.pattern.homework.phone.MobilePhone;
import com.evyn.design.pattern.homework.phone.pojo.ApplePhone;
import com.evyn.design.pattern.homework.phone.pojo.NokiaPhone;
import com.evyn.design.pattern.homework.phone.pojo.XMPhone;

/**
 * @ClassName SimplePhoneFactoryTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 18:01
 * @Version 1.0
 */
public class SimplePhoneFactoryTest {

    public static void main(String[] args) {
        SimpleMobilePhoneFactory factory = new SimpleMobilePhoneFactory();
        MobilePhone applePhone = factory.generatePhone(ApplePhone.class);
        MobilePhone xmPhone = factory.generatePhone(XMPhone.class);
        MobilePhone nokiaPhone = factory.generatePhone(NokiaPhone.class);
        applePhone.call();
        xmPhone.call();
        nokiaPhone.call();
    }
}
