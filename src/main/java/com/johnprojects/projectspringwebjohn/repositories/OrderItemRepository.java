package com.johnprojects.projectspringwebjohn.repositories;

import com.johnprojects.projectspringwebjohn.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
