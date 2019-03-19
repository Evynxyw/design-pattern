package com.evyn.design.pattern.observer.events;


import com.evyn.design.pattern.observer.events.core.Event;
import com.evyn.design.pattern.observer.events.mouse.Mouse;
import com.evyn.design.pattern.observer.events.mouse.MouseEventCallback;
import com.evyn.design.pattern.observer.events.mouse.MouseEventType;

import java.lang.reflect.Method;

public class MouseTest {

    public static void main(String[] args) throws NoSuchMethodException {


//        try {
////            MouseEventCallback callback = new MouseEventCallback();
////            Method onClick = MouseEventCallback.class.getMethod("onClick", Event.class);
//
//
//            //人为的调用鼠标的单击事件
//            Mouse mouse = new Mouse();
////            mouse.addLisenter(MouseEventType.ON_CLICK, callback,onClick);
//
//            mouse.click();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        test1();

    }

    public static void test1() throws NoSuchMethodException {
        Mouse mouse = new Mouse();

        MouseEventCallback callback = new MouseEventCallback();
        Method onClick = MouseEventCallback.class.getMethod("onClick", Event.class);
//
        mouse.addLisenter(MouseEventType.ON_CLICK, callback, onClick);
        mouse.click();
    }

}
