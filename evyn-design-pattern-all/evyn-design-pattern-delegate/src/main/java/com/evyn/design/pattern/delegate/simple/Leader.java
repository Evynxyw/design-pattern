package com.evyn.design.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Leader
 * @Description:
 * @Author xyw
 * @Date 2019/3/13 20:40
 * @Version 1.0
 */
public class Leader {
    public Map<String, IEmployee> register = new HashMap<String, IEmployee>();

    public Leader(){
        register.put("加密", new EmployeeA());
        register.put("架构", new EmployeeB());
    }
    public void doing(String command){
        register.get(command).doing(command);
    }
}
