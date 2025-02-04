package com.content.evandro.course.config;

import com.content.evandro.course.models.Product;
import com.content.evandro.course.models.User;
import com.content.evandro.course.repositories.ProductRepository;
import com.content.evandro.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ProductRepository repository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        Product p = new Product(null,"Nome",  "Descrição do produto",234.5, "/imagem do produto");
        User user = new User(null, "Sandro","sandro@hotmail.com","11 9 97971741","123456");
        userRepository.save(user);
        repository.save(p);
    }
}
