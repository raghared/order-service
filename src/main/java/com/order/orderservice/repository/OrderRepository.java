package com.order.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.orderservice.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // define any custom methods for the Order repository, if needed
}
