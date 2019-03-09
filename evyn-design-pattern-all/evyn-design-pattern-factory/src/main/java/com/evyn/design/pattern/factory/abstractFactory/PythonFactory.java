package com.evyn.design.pattern.factory.abstractFactory;

import com.evyn.design.pattern.factory.ICourse;
import com.evyn.design.pattern.factory.INote;
import com.evyn.design.pattern.factory.ISource;
import com.evyn.design.pattern.factory.IVideo;

/**
 * @ClassName PythonFactory
 * @Description:
 * @Author xyw
 * @Date 2019/3/6 22:55
 * @Version 1.0
 */
public class PythonFactory implements ICourseFactory{
    public ISource createIsource() {
        return null;
    }

    public ICourse createCourse() {
        return null;
    }

    public INote createNote() {
        return null;
    }

    public IVideo createVideo() {
        return null;
    }
}
