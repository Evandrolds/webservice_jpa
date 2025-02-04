package com.content.evandro.course.repositories;


import com.content.evandro.course.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
}
