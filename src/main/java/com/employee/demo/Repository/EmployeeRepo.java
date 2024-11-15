package com.employee.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.demo.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
