package com.content.evandro.course.repositories;


import com.content.evandro.course.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>{
}
