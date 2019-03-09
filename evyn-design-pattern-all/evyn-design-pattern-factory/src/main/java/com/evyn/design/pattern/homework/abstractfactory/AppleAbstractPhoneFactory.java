package com.evyn.design.pattern.homework.abstractfactory;

import com.evyn.design.pattern.homework.phone.MobilePhone;
import com.evyn.design.pattern.homework.phone.MobilePhoneBill;
import com.evyn.design.pattern.homework.phone.pojo.ApplePhone;
import com.evyn.design.pattern.homework.phone.pojo.ApplePhoneBill;

/**
 * @ClassName AppleAbstractPhoneFactory
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 18:42
 * @Version 1.0
 */
public class AppleAbstractPhoneFactory implements MobilePhoneFactory{
    public MobilePhone generatePhone() {
        return new ApplePhone();
    }

    public MobilePhoneBill phoneBill() {
        return new ApplePhoneBill();
    }
}
