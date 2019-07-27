package com.nikhil.jpa.jpademo.repository;

import com.nikhil.jpa.jpademo.model.UserS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserS, Integer> {
}
