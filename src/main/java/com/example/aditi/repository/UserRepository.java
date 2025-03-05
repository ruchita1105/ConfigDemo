package com.example.aditi.repository;


import com.example.aditi.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
   public String findByEmail();
}
