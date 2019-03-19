package com.evyn.design.pattern.observer.homework;

import com.alibaba.fastjson.JSON;
import com.google.common.eventbus.EventBus;

/**
 * @ClassName GPer
 * @Description:
 * @Author xyw
 * @Date 2019/3/18 21:55
 * @Version 1.0
 */
public class GPer {
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

    public void publicQuestion(Question question){
        EventBus eventBus = new EventBus();
        QuestionListen questionListen = new QuestionListen();
        eventBus.register(questionListen);

        eventBus.post(JSON.toJSONString(question));

    }
}
