package com.evyn.design.pattern.adapter.v2.adapters;

import com.evyn.design.pattern.adapter.v2.ResultMsg;


public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
