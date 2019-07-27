package com.nikhil.jpa.jpademo.service;

import com.nikhil.jpa.jpademo.model.UserS;
import com.nikhil.jpa.jpademo.repository.AddressRepository;
import com.nikhil.jpa.jpademo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressRepository addressRepository;

    public List<UserS> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<UserS> getUser(int userId) {
        return userRepository.findById(userId);
    }

    public UserS saveUser(UserS userS) {

        return userRepository.save(userS);
    }
}
