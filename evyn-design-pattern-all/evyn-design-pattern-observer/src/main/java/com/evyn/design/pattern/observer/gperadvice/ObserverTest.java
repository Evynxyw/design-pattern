package com.evyn.design.pattern.observer.gperadvice;

/**
 * @ClassName ObserverTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 21:19
 * @Version 1.0
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景");
        gPer.addObserver(tom);
        gPer.addObserver(mic);
        gPer.publishQuestion(question);
    }
}
