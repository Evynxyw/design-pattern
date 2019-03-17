package com.evyn.design.pattern.adapter.v2.adapters;


import com.evyn.design.pattern.adapter.v2.ResultMsg;

public class RegistForQQAdapter implements RegistAdapter,LoginAdapter {
    public boolean support(Object adapter) {
        return false;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
