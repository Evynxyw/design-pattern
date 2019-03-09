package com.evyn.design.pattern.homework.phone.pojo;

import com.evyn.design.pattern.homework.phone.MobilePhoneBill;

/**
 * @ClassName ApplePhoneBill
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 18:34
 * @Version 1.0
 */
public class NokiaPhoneBill implements MobilePhoneBill {
    public void freeBill() {
        System.out.println("Nokia手机赠送话费200分钟");
    }
}
