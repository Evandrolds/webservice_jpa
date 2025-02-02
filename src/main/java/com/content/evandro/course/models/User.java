package com.content.evandro.course.models;


import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
@Table(name = "User_Client")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}
