package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.Employee;

@RestController
public class EmpController {
	
	
	@GetMapping("/api/users")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setEmpId(234);
		emp.setEmpName("Yash Deshmukh");
		emp.setEmpSalary(250000);
		return emp;
	}
	
	@PostMapping("/api/users")
	public String saveProduct(@RequestBody Employee emp)
	{
		System.out.println("employee id received : "+emp.getEmpId());
		System.out.println("employee name received : "+emp.getEmpName());
		System.out.println("employee salary received : "+emp.getEmpSalary());
		return "employee received";
	}
	
}
