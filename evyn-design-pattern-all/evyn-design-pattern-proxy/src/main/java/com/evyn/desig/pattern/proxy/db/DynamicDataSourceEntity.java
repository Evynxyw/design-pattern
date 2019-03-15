package com.evyn.desig.pattern.proxy.db;

/**
 * @ClassName DynamicDataSourceEntity
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 21:12
 * @Version 1.0
 */
public class DynamicDataSourceEntity {
    public final static String DEFAULE_SOURCE = null;
    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntity() {
    }

    public static String getLocal() {
        return local.get();
    }

    public static void set(int year){
        local.set("DB_" + year);
    }

    public static void set(String source){
        local.set(source);
    }

    public static void restore(){
        local.set(DEFAULE_SOURCE);
    }
}
