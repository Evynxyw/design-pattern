package com.evyn.design.pattern.factory.abstractFactory;

import com.evyn.design.pattern.factory.*;

/**
 * @ClassName JavaCourseFactory
 * @Description:
 * @Author xyw
 * @Date 2019/3/6 22:52
 * @Version 1.0
 */
public  class JavaCourseFactory implements ICourseFactory {
    public ICourse createCourse() {
        return new JavaCourse();
    }

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }

    public ISource createIsource() {
        return new JavaSource();
    }
}
