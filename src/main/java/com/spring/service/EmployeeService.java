package com.spring.service;

import org.springframework.stereotype.Component;

import com.spring.models.Employee;

@Component
public class EmployeeService {
	
	public Employee saveEmployee(Employee emp) {
		emp.setId(emp.getId()+1);
		return emp;
	}
	

}
