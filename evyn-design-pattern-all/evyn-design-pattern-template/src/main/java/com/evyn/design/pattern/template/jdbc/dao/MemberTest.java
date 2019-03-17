package com.evyn.design.pattern.template.jdbc.dao;

import java.util.List;

/**
 * @ClassName MemberTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 20:49
 * @Version 1.0
 */
public class MemberTest {
    public static void main(String[] args) {

        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);


    }
}
