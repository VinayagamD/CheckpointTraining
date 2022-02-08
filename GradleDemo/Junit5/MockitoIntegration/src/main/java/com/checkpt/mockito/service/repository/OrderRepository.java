package com.checkpt.mockito.service.repository;

import com.checkpt.mockito.service.models.Order;

public interface OrderRepository {
    Order save(Order order);
}
