package com.evyn.desig.pattern.proxy.staticproxy;

/**
 * @ClassName Father
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 21:03
 * @Version 1.0
 */
public class Father {

    private Person person;

    public Father(Son person) {
        this.person = person;
    }

    public void findLove(){
        System.out.println("父亲无色对象");
        this.person.findLove();
        System.out.println("父母双方同意");
    }
}
