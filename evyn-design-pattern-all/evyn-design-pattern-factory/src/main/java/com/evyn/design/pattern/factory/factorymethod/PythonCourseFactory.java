package com.evyn.design.pattern.factory.factorymethod;

import com.evyn.design.pattern.factory.ICourse;
import com.evyn.design.pattern.factory.PythonCourse;

/**
 * @ClassName PythonCourseFactory
 * @Description:
 * @Author xyw
 * @Date 2019/3/6 22:31
 * @Version 1.0
 */
public class PythonCourseFactory implements  ICourseFactory{
    public ICourse create() {
        return new PythonCourse();
    }
}
