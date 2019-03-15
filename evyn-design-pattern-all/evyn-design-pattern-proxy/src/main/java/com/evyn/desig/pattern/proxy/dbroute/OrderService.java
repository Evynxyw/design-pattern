package com.evyn.desig.pattern.proxy.dbroute;

/**
 * @ClassName OrderService
 * @Description:
 * @Author xyw
 * @Date 2019/3/10 21:11
 * @Version 1.0
 */
public class OrderService {
    private OrderDao orderDao;

    public OrderService(){
        orderDao = new OrderDao();
    }

    public int createOrder(Order order) {
        System.out.println("OrderService调用orderDao创建订单");
        return orderDao.insert(order);
    }
}
