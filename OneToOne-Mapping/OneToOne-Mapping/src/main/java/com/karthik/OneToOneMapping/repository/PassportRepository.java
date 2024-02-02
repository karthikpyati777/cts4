package com.karthik.OneToOneMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.OneToOneMapping.entities.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
