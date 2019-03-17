package com.evyn.design.pattern.template.course;

/**
 * @ClassName NetWorkCourse
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 20:13
 * @Version 1.0
 */
public abstract class NetWorkCourse {

    public final void createCourse(){

        this.postPreResource();
        this.createPPT();
        this.liveVideo();
        this.postNote();
        this.postSource();
        if(needHomework()){
            checkHomework();
        }

    }

    public abstract void checkHomework();


    public boolean needHomework(){
        return false;
    }

    private final void postSource() {
        System.out.println("提交源码");
    }

    private final void postNote() {
        System.out.println("提交课件和笔记");
    }

    private final void liveVideo() {
        System.out.println("直播授课");
    }

    protected final void createPPT(){
        System.out.println("创建ppt");
    }

    protected final void postPreResource(){
        System.out.println("分发预习资料");
    }
}
