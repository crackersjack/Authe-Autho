package com.nikhil.jpa.jpademo.repository;

import com.nikhil.jpa.jpademo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
