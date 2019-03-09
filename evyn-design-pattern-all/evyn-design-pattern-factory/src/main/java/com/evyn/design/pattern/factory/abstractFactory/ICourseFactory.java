package com.evyn.design.pattern.factory.abstractFactory;

import com.evyn.design.pattern.factory.ICourse;
import com.evyn.design.pattern.factory.INote;
import com.evyn.design.pattern.factory.ISource;
import com.evyn.design.pattern.factory.IVideo;

/**
 * @ClassName ICourseFactory
 * @Description:所有的子工厂都实现这个工厂
 *          一个品牌的抽象
 * @Author xyw
 * @Date 2019/3/6 22:48
 * @Version 1.0
 */
public interface ICourseFactory {
    ICourse createCourse();
    INote createNote();
    IVideo createVideo();
    ISource createIsource();
}
