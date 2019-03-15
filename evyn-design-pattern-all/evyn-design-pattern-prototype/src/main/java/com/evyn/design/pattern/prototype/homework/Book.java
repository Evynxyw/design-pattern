package com.evyn.design.pattern.prototype.homework;

import java.io.Serializable;

/**
 * @ClassName Book
 * @Description:
 * @Author xyw
 * @Date 2019/3/15 21:24
 * @Version 1.0
 */
public class Book implements Serializable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
