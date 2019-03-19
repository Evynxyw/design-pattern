package com.evyn.design.pattern.observer.homework;

/**
 * @ClassName GperTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/18 22:04
 * @Version 1.0
 */
public class GperTest {

    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景");
        Teacher teacher = new Teacher("Tom");
        question.setTeacher(teacher);
        gPer.publicQuestion(question);


        Teacher teacher1 = new Teacher("Mic");
        question.setTeacher(teacher1);
        gPer.publicQuestion(question);
    }
}
