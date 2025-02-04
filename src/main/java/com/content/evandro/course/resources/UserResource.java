package com.content.evandro.course.resources;

import com.content.evandro.course.models.Product;
import com.content.evandro.course.models.User;
import com.content.evandro.course.repositories.UserRepository;
import com.content.evandro.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserResource {

    private final UserService service;

    @Autowired
    public UserResource( UserService service){
        this.service= service;
    }

    @GetMapping(value = "/findall")
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(service.findAllUsers());
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveUsers(@RequestBody User user){
        return new ResponseEntity<>(service.saveUser(user),HttpStatus.CREATED);
    }
}
