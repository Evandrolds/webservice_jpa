package com.content.evandro.course.repositories;


import com.content.evandro.course.models.Order;
import com.content.evandro.course.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long>{
}
