package com.checkpt.mockito.service.service;

import com.checkpt.mockito.service.models.Order;
import com.checkpt.mockito.service.repository.OrderRepository;

import java.time.LocalDateTime;

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order create(Order order) {
        order.setCreationDate(LocalDateTime.now());
        return orderRepository.save(order);
    }

}
