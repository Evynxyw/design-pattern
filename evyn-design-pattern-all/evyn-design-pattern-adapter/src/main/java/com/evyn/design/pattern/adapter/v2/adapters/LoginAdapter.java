package com.evyn.design.pattern.adapter.v2.adapters;

import com.evyn.design.pattern.adapter.v2.ResultMsg;

public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);

}
