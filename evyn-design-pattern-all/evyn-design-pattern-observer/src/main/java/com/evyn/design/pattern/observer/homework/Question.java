package com.evyn.design.pattern.observer.homework;

/**
 * @ClassName Question
 * @Description:
 * @Author xyw
 * @Date 2019/3/17 21:12
 * @Version 1.0
 */
public class Question {
    private String userName;
    private String content;
    private Teacher teacher;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
