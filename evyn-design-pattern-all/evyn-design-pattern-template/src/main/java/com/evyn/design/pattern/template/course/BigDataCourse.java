package com.evyn.design.pattern.template.course;

/**
 * @ClassName BigDataCourse
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 20:21
 * @Version 1.0
 */
public class BigDataCourse  extends NetWorkCourse{

    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    public void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }

    @Override
    public boolean needHomework() {
        return this.needHomeworkFlag;
    }
}
