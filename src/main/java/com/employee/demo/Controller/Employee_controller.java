package com.employee.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.Employee;
import com.employee.demo.Repository.EmployeeRepo;

@RestController
@RequestMapping("/employe")
public class Employee_controller {
	@Autowired
	EmployeeRepo emprepo;
	@GetMapping("/get")
	public List<Employee> getEmpDetails() {
		return emprepo.findAll();
	}
	
	@PostMapping("/add")
	public String addEmpDetails(Employee emp) {
		emprepo.save(emp);
		return "Created";
	}
}
