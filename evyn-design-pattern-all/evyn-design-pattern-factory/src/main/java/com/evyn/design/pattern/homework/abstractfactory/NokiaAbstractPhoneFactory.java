package com.evyn.design.pattern.homework.abstractfactory;

import com.evyn.design.pattern.homework.phone.MobilePhone;
import com.evyn.design.pattern.homework.phone.MobilePhoneBill;
import com.evyn.design.pattern.homework.phone.pojo.ApplePhone;
import com.evyn.design.pattern.homework.phone.pojo.ApplePhoneBill;
import com.evyn.design.pattern.homework.phone.pojo.NokiaPhone;
import com.evyn.design.pattern.homework.phone.pojo.NokiaPhoneBill;

/**
 * @ClassName AppleAbstractPhoneFactory
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 18:42
 * @Version 1.0
 */
public class NokiaAbstractPhoneFactory implements MobilePhoneFactory{
    public MobilePhone generatePhone() {
        return new NokiaPhone();
    }

    public MobilePhoneBill phoneBill() {
        return new NokiaPhoneBill();
    }
}
