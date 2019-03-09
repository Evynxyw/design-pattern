package com.evyn.design.pattern.homework.abstractfactory;

import com.evyn.design.pattern.homework.phone.MobilePhone;
import com.evyn.design.pattern.homework.phone.MobilePhoneBill;

/**
 * @ClassName MobilePhoneFactory
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 18:37
 * @Version 1.0
 */
public interface MobilePhoneFactory {
    MobilePhone generatePhone();
    MobilePhoneBill phoneBill();
}
