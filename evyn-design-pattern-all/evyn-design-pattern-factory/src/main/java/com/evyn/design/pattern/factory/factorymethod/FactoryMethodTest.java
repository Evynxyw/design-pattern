package com.evyn.design.pattern.factory.factorymethod;

import com.evyn.design.pattern.factory.ICourse;

/**
 * @ClassName FactoryMethodTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/6 22:32
 * @Version 1.0
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        ICourseFactory factory1 = new JavaCourseFactory();
        ICourse icourse = factory1.create();
        icourse.record();
    }


}
