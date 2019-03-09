package com.evyn.design.pattern.homework.phone.pojo;

import com.evyn.design.pattern.homework.phone.MobilePhoneBill;

/**
 * @ClassName ApplePhoneBill
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 18:34
 * @Version 1.0
 */
public class ApplePhoneBill implements MobilePhoneBill {
    public void freeBill() {
        System.out.println("苹果手机赠送话费100分钟");
    }
}
