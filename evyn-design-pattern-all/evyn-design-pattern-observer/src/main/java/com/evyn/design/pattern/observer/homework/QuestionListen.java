package com.evyn.design.pattern.observer.homework;


import com.alibaba.fastjson.JSON;
import com.google.common.eventbus.Subscribe;

/**
 * @ClassName QuestionListen
 * @Description:
 * @Author xyw
 * @Date 2019/3/18 22:29
 * @Version 1.0
 */
public class QuestionListen {
    @Subscribe
    public void subscribe(String messge) {
        Question question = JSON.parseObject(messge, Question.class);
        Teacher teacher = question.getTeacher();
        System.out.println("---------------------------------");
        System.out.println(teacher.getName() + "老师，你好!\n" +
                "您收到了一个来自咕泡生态圈的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}
