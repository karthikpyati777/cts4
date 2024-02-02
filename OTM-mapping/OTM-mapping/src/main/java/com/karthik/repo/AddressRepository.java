package com.karthik.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
