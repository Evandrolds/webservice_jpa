package com.content.evandro.course.resources;

import com.content.evandro.course.models.Product;
import com.content.evandro.course.models.User;
import com.content.evandro.course.services.ProductService;
import com.content.evandro.course.services.UserService;
import jakarta.persistence.EntityNotFoundException;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/find-all")
    public ResponseEntity<List<Product>> findAllProducts(){
        return ResponseEntity.ok(service.findAllProducts());
    }

    @PostMapping("/save")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {

        Product prod = service.saveProduct(product);
        return new ResponseEntity<>(prod, HttpStatus.CREATED);
    }
}
