package com.evyn.design.pattern.factory.abstractFactory;

/**
 * @ClassName AbstractFactoryTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/6 22:53
 * @Version 1.0
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new JavaCourseFactory();
        iCourseFactory.createCourse().record();
        iCourseFactory.createIsource().record();
        iCourseFactory.createNote().record();
        iCourseFactory.createVideo().record();

    }
}
