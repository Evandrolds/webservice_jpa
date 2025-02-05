package com.content.evandro.course.models;

import com.content.evandro.course.enuns.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Data
@Entity
@NoArgsConstructor
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant dateOrder;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    @ManyToOne
    @JoinColumn(name = "client.id")
    private User client;

    public Order(Long id, Instant dateOrder, OrderStatus orderStatus, User client) {
        this.id = id;
        this.dateOrder = dateOrder;
        this.orderStatus = orderStatus;
        this.client = client;
    }
}
