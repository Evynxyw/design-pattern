package com.evyn.design.pattern.observer.gperadvice;

import java.util.Observable;

/**
 * @ClassName GPer
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 21:10
 * @Version 1.0
 */
public class GPer extends Observable {

    private String name = "GPer生态圈";
    private static GPer gPer = null;
    private GPer(){}

    public static GPer getInstance(){
        if(null == gPer){
            gPer = new GPer();
        }
        return gPer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() +
                "在" + this.name + "上提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
