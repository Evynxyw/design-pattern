package com.evyn.design.pattern.homework.simplefactory;

import com.evyn.design.pattern.homework.phone.MobilePhone;

/**
 * @ClassName SimpleMobilePhoneFactory
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 17:53
 * @Version 1.0
 */
public class SimpleMobilePhoneFactory {

    public MobilePhone generatePhone(Class clazz){
        try {
            if(clazz != null){
                return (MobilePhone)clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
