package com.evyn.desig.pattern.proxy.dbroute;

/**
 * @ClassName OrderDao
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 21:10
 * @Version 1.0
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
