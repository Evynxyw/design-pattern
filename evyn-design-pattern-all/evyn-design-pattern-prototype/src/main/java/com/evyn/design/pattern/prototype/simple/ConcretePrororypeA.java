package com.evyn.design.pattern.prototype.simple;

import java.util.List;

/**
 * @ClassName ConcretePrororypeA
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 20:16
 * @Version 1.0
 */
public class ConcretePrororypeA implements Prototype{
    private String name;
    private int age;
    private List<String> habbies;

    public ConcretePrororypeA() {
    }

    public List<String> getHabbies() {
        return habbies;
    }

    public void setHabbies(List<String> habbies) {
        this.habbies = habbies;
    }

    public ConcretePrororypeA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Prototype clone() {
        ConcretePrororypeA concretePrororypeA = new ConcretePrororypeA();
        concretePrororypeA.setName(this.name);
        concretePrororypeA.setAge(this.age);
        concretePrororypeA.setHabbies(this.habbies);
        return concretePrororypeA;
    }

    @Override
    public String toString() {
        return "ConcretePrororypeA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", habbies=" + habbies +
                '}';
    }
}
