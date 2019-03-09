package com.evyn.design.pattern.factory;

import com.evyn.design.pattern.factory.ICourse;

/**
 * @ClassName JavaCourse
 * @Description:
 * @Author xyw
 * @Date 2019/3/6 22:06
 * @Version 1.0
 */
public class PythonCourse implements ICourse{
    public void record() {
        System.out.println("录制Python课程");
    }
}
