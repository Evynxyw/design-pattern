package com.evyn.design.pattern.adapter.v2;

/**
 * @ClassName IPassportForThird
 * @Description:
 * @Author xyw
 * @Date 2019/3/16 21:25
 * @Version 1.0
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String id);


    ResultMsg loginForWechat(String id);


    ResultMsg loginForToken(String token);


    ResultMsg loginForTelphone(String telphone, String code);

    ResultMsg loginForRegist(String username, String passport);
}
