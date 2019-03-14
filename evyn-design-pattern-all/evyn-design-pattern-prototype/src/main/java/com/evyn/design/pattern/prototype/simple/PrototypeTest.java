package com.evyn.design.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PrototypeTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 20:15
 * @Version 1.0
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrororypeA concretePrororype = new ConcretePrororypeA();
        concretePrororype.setName("Evyn");
        concretePrororype.setAge(30);
        List<String> habbies = new ArrayList<String>();
        habbies.add("1");
        habbies.add("2");
        habbies.add("3");
        concretePrororype.setHabbies(habbies);
        System.out.println(concretePrororype);

        Client client = new Client(concretePrororype);
        ConcretePrororypeA prororypeA = (ConcretePrororypeA)client.startClone(concretePrororype);
        System.out.println(prororypeA);

        System.out.println("克隆对象中的引用类型地址值：" + prororypeA.getHabbies());
        System.out.println("原对象中的引用类型地址值：" + prororypeA.getHabbies());
        System.out.println("对象地址比较："+(concretePrororype.getHabbies() == prororypeA.getHabbies()));

    }

}
