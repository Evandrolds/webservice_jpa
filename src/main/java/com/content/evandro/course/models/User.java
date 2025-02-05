package com.content.evandro.course.models;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_user")
public class User implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
    @OneToMany(mappedBy = "client")
    private List<Order> orders = new ArrayList<>();

    private List<Order> getOrders(){
        return orders;
    }
}
