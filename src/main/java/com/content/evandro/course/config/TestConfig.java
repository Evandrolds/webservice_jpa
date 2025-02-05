package com.content.evandro.course.config;

import com.content.evandro.course.enuns.OrderStatus;
import com.content.evandro.course.models.Order;
import com.content.evandro.course.models.Product;
import com.content.evandro.course.models.User;
import com.content.evandro.course.repositories.OrderRepository;
import com.content.evandro.course.repositories.ProductRepository;
import com.content.evandro.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.reflect.Array;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ProductRepository repository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        Product p = new Product(null,"Nome",  "Descrição do produto",234.5, "/imagem do produto");
        User u0 = new User(null, "Sandro","sandro@hotmail.com","11 9 97971741","123456",null);
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456",null);
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456",null);

        Order o0 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERY, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.PENDING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.CANCELED,u0);

        userRepository.saveAll(Arrays.asList(u0,u1,u2));
        repository.save(p);
        orderRepository.saveAll(Arrays.asList( o0,o2,o3));


    }
    
}
