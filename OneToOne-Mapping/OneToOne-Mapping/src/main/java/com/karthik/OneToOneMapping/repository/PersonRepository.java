package com.karthik.OneToOneMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.OneToOneMapping.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
