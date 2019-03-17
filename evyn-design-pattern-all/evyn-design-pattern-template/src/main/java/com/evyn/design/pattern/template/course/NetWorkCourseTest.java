package com.evyn.design.pattern.template.course;

/**
 * @ClassName NetWorkCourseTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 20:22
 * @Version 1.0
 */
public class NetWorkCourseTest {

    public static void main(String[] args) {
        System.out.println("-------Java架构师课程--------");
        NetWorkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("-------大数据课程--------");
        NetWorkCourse bigDataCourse  = new BigDataCourse(true);
        bigDataCourse.createCourse();

    }
}
