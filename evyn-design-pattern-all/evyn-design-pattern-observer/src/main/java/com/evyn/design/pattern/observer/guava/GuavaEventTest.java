package com.evyn.design.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @ClassName GuavaEventTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 21:54
 * @Version 1.0
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("Evyn");
        eventBus.post("Tom");
    }
}
