package com.johnprojects.projectspringwebjohn.repositories;

import com.johnprojects.projectspringwebjohn.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
