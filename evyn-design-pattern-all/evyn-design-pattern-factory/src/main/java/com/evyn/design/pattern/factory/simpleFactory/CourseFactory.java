package com.evyn.design.pattern.factory.simpleFactory;

import com.evyn.design.pattern.factory.ICourse;
import com.evyn.design.pattern.factory.JavaCourse;

/**
 * @ClassName CourseFactory
 * @Description:
 * @Author xyw
 * @Date 2019/3/6 22:09
 * @Version 1.0
 */
public class CourseFactory {

    public ICourse Create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }
        return null;
    }

    public ICourse course(Class clazz){

        try {
            if(null != clazz ){
                return (ICourse)clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
