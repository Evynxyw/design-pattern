package com.evyn.design.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @ClassName GuavaEvent
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 21:52
 * @Version 1.0
 */
public class GuavaEvent {
    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入参数：" + str);
    }
}
