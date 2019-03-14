package com.evyn.design.pattern.delegate.simple;

/**
 * @ClassName BossTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/13 21:04
 * @Version 1.0
 */
public class BossTest {

    public static void main(String[] args) {
        Boss boss = new Boss(new Leader());
        boss.leader.doing("加密");
        boss.leader.doing("架构");
    }
}
