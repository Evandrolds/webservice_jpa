package com.content.evandro.course.services;

import com.content.evandro.course.models.Product;
import com.content.evandro.course.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private  ProductRepository repository;


    public List<Product> findAllProducts(){
        return repository.findAll();
    }

    public Product saveProduct(Product product){
        return repository.save(product);
    }
    public Product findById(long id){
        return repository.findById(id).orElseThrow(()
                -> new EntityNotFoundException("Object not found with Id = " + id));
    }
}
