package com.content.evandro.course.resources;

import com.content.evandro.course.models.Order;
import com.content.evandro.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderResource {

    private final OrderService service;

    @Autowired
    public OrderResource(OrderService service){
        this.service= service;
    }

    @GetMapping(value = "/findall")
    public ResponseEntity<List<Order>> findAll(){
        return ResponseEntity.ok(service.findAllOrders());
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveOrders(@RequestBody Order order){
        return new ResponseEntity<>(service.saveOrder(order),HttpStatus.CREATED);
    }
}
