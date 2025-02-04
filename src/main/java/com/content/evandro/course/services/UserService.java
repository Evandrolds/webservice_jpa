package com.content.evandro.course.services;

import com.content.evandro.course.models.User;
import com.content.evandro.course.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository){
        this.repository = repository;
    }
    public List<User> findAllUsers(){
        return repository.findAll();
    }

    public String saveUser(User user){
        repository.save(user);
        return "User created";
    }
    public User findById(long id){
        return repository.findById(id).orElseThrow(()
                -> new EntityNotFoundException("Object not found with Id = " + id));
    }
}
