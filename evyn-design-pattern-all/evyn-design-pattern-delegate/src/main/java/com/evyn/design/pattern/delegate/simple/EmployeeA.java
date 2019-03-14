package com.evyn.design.pattern.delegate.simple;

/**
 * @ClassName EmployeeA
 * @Description:
 * @Author xyw
 * @Date 2019/3/13 20:42
 * @Version 1.0
 */
public class EmployeeA implements IEmployee{
    public void doing(String command) {
        System.out.println("我是员工A，我开始干活了，我擅长加密执行：" + command);
    }
}
