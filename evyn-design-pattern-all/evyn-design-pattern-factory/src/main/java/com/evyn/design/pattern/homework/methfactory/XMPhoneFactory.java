package com.evyn.design.pattern.homework.methfactory;

import com.evyn.design.pattern.homework.phone.MobilePhone;
import com.evyn.design.pattern.homework.phone.pojo.XMPhone;

/**
 * @ClassName ApplePhoneFactory
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 18:09
 * @Version 1.0
 */
public class XMPhoneFactory implements MobilePhoneFactory {

    public MobilePhone generatePhone() {
        return new XMPhone();
    }
}