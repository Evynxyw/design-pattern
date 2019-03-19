package com.evyn.design.pattern.observer.homework;

import com.evyn.design.pattern.observer.gperadvice.GPer;
import com.evyn.design.pattern.observer.gperadvice.Question;
import com.google.common.eventbus.Subscribe;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName Teacher
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 21:15
 * @Version 1.0
 */
public class Teacher{

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
