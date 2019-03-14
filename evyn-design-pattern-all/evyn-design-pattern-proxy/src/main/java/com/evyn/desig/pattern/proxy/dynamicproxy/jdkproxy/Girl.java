package com.evyn.desig.pattern.proxy.dynamicproxy.jdkproxy;

import com.evyn.desig.pattern.proxy.staticproxy.Person;

/**
 * @ClassName Girl
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 21:26
 * @Version 1.0
 */
public class Girl implements Person {
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}
