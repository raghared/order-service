package com.order.orderservice.service;

import com.order.orderservice.model.Order;

public interface OrderService {
    Order createOrder(Order order);
    Order getOrder(Long orderId);
    Order updateOrder(Order order);
    boolean deleteOrder(Long orderId);
}
