package com.johnprojects.projectspringwebjohn.services;

import com.johnprojects.projectspringwebjohn.entities.Order;
import com.johnprojects.projectspringwebjohn.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> order = orderRepository.findById(id);

        return order.get();
    }
}
