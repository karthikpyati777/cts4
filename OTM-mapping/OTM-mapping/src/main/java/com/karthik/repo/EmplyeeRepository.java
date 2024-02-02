package com.karthik.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.entities.Employee;

public interface EmplyeeRepository extends JpaRepository<Employee, Integer> {

}
