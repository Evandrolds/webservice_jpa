package com.content.evandro.course;

import com.content.evandro.course.models.Product;
import com.content.evandro.course.models.User;
import com.content.evandro.course.repositories.ProductRepository;
import com.content.evandro.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApplication{

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

}
