package com.evyn.design.pattern.homework.methfactory;

import com.evyn.design.pattern.homework.phone.MobilePhone;
import com.evyn.design.pattern.homework.phone.pojo.ApplePhone;

/**
 * @ClassName ApplePhoneFactory
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 18:09
 * @Version 1.0
 */
public class ApplePhoneFactory implements MobilePhoneFactory {

    public MobilePhone generatePhone() {
        return new ApplePhone();
    }
}
