package com.ecomproject.repository;

import com.ecomproject.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<Order,Long> {

}
