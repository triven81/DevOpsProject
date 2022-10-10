package net.javaguide.springboot.controller;

import java.util.List;

import javax.persistence.PostLoad;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguide.springboot.model.Employee;
import net.javaguide.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	//Build Create Employee API
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	// Build get all employees REST API
	@GetMapping
	public List<Employee> getAllEmployess()
	{
		return employeeService.getAllEmployees();
	}
	
	//Build get employee by id REST API 
	
	//@GetMapping({/id})
	public ResponseEntity<Employee> getEmployee>
	
	

}
