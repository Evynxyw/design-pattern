package com.evyn.design.pattern.factory.simpleFactory;

import com.evyn.design.pattern.factory.ICourse;
import com.evyn.design.pattern.factory.JavaCourse;

/**
 * @ClassName SimpleFactoryTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/6 22:07
 * @Version 1.0
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        //ICourse course = new JavaCourse();

        CourseFactory factory = new CourseFactory();
        //ICourse course = factory.Create("java");
        ICourse course = factory.course(JavaCourse.class);
        course.record();

    }
}
