package com.evyn.design.pattern.factory.factorymethod;

import com.evyn.design.pattern.factory.ICourse;
import com.evyn.design.pattern.factory.JavaCourse;

/**
 * @ClassName JavaCourseFactory
 * @Description:
 * @Author xyw
 * @Date 2019/3/6 22:29
 * @Version 1.0
 */
public class JavaCourseFactory implements  ICourseFactory{
    public ICourse create() {
        return new JavaCourse();
    }
}
