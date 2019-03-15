package com.evyn.desig.pattern.proxy.dbroute;

import com.evyn.desig.pattern.proxy.dbroute.proxy.OrderServiceDynamicProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DBrouteTest
 * @Description:
 * @Author xyw
 * @Date 2019/3/15 22:16
 * @Version 1.0
 */
public class DBrouteTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();
//          order.setCreateTime(new Date().getTime());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
