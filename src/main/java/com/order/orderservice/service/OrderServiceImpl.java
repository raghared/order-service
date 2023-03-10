package com.order.orderservice.service;


import java.util.Optional;

import org.springframework.stereotype.Service;

import com.order.orderservice.model.Order;
import com.order.orderservice.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {


    private final OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        // perform any necessary business logic before saving the order
        return orderRepository.save(order);
    }

    @Override
    public Order getOrder(Long orderId) {
         Optional<Order> order= orderRepository.findById(orderId);
        return order.orElse(null);
    }

    @Override
    public Order updateOrder(Order order) {
        // perform any necessary business logic before updating the order
        if (orderRepository.existsById(order.getId())) {
            return orderRepository.save(order);
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteOrder(Long orderId) {
        // perform any necessary business logic before deleting the order
        if (orderRepository.existsById(orderId)) {
            orderRepository.deleteById(orderId);
            return true;
        } else {
            return false;
        }
    }

}
