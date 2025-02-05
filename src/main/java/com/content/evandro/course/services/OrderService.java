package com.content.evandro.course.services;

import com.content.evandro.course.models.Order;
import com.content.evandro.course.repositories.OrderRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;

    @Autowired
    public OrderService(OrderRepository repository){
        this.repository = repository;
    }
    public List<Order> findAllOrders(){
        return repository.findAll();
    }

    public String saveOrder(Order Order){
        repository.save(Order);
        return "Order created";
    }
    public Order findById(long id){
        return repository.findById(id).orElseThrow(()
                -> new EntityNotFoundException("Object not found with Id = " + id));
    }
}
