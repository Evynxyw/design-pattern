package com.evyn.design.pattern.adapter.v2.adapters;


import com.evyn.design.pattern.adapter.v2.ResultMsg;

public class LoginForWechatAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
