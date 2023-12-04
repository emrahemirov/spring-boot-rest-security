package com.springdemo.springboot.cruddemo.dao;

import com.springdemo.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    

}
