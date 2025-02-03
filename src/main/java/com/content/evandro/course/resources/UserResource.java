package com.content.evandro.course.resources;

import com.content.evandro.course.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping(value = "/findall")
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Sandro","sandro@hotmail.com","11983753453","123456");
        return ResponseEntity.ok(u);
    }
    @PostMapping("/save")
    public ResponseEntity<User> saveUsers(@RequestBody User user){
        URI uri = URI.create("/users/save");
        return ResponseEntity.created(uri).body(user);
    }
}
