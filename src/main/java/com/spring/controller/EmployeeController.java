package com.spring.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.models.Employee;
import com.spring.repository.EmployeeRepository;
import com.spring.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeservice;
	@Autowired
	EmployeeRepository employeerepository;

	@RequestMapping("/")
	public String  message() {
		return "hello";
	}
	@RequestMapping("/helloworld")
	public String  helloWorld() {
		return "hi";
	}
	@RequestMapping("/helloworld/{name}")
	public String  helloWorldName(@PathVariable String name) {
		return "hi  "  +name;
	}

	@RequestMapping("/helloworld/emp")
	public Employee getEmployee() {
				return  new Employee(1,"naveneeth",new Date());
		}
	
	public Employee saveEmployee() {
	return employeeservice.saveEmployee(new Employee(32,"smani",new Date()));
	}
	
	@RequestMapping("/helloworld/postemp")
	public Employee savePostEmployee(@RequestBody Employee emp) {
		return employeeservice.saveEmployee(emp);
		
	}
	
	@RequestMapping("/helloworld/db/emp")
	public List<Employee> getEmployeeDB() {
				return  employeerepository.findAll();
		}
	
	@GetMapping("/jpa/getemp)")
	public List<Employee> jpagetEmployee(){
	return employeerepository.findAll();
	
}
@GetMapping("/jpa/getemp/{id})")
public Optional<Employee> jpahetemployee(@PathVariable Integer id) throws Exception{
		Optional<Employee> emp=employeerepository.findById(id);
		if(emp.isPresent())
			throw new Exception("emp id"+id);
		return emp;
		
}
}


