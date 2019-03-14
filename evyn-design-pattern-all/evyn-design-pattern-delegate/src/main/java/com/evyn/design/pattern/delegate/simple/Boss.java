package com.evyn.design.pattern.delegate.simple;

/**
 * @ClassName Boss
 * @Description:
 * @Author xyw
 * @Date 2019/3/13 20:59
 * @Version 1.0
 */
public class Boss {
    public Leader leader;

    public Boss(Leader leader) {
        this.leader = leader;
    }

}
