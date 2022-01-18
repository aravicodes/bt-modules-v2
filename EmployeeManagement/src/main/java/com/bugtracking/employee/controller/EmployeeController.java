package com.bugtracking.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bugtracking.employee.dto.EmployeeDto;
import com.bugtracking.employee.services.IEmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RestController
public class EmployeeController {
	RestTemplate rt = new RestTemplate();
	@Autowired
	IEmployeeService es;

	@ApiOperation("Used to create employee")
	@PostMapping("/employees")
	public EmployeeDto createEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
		return es.createEmployee(employeeDto);
	}

	@ApiOperation("Used to fetch employee with particular id")
	@GetMapping("/employees/{empId}")
	public EmployeeDto readEmployee(@PathVariable long empId) {
		return es.getEmployee(empId);
	}

	@ApiOperation("Used to fetch all employees")
	@GetMapping("/employees")
	public List<EmployeeDto> readAllEmployees() {
		return es.getAllEmployees();
	}

	@ApiOperation("Used to update employees")
	@PutMapping("/employees/{empId}")
	public EmployeeDto updateEmployee(@PathVariable("empId") long empId, @Valid @RequestBody EmployeeDto e) {
		return es.updateEmployee(empId, e);
	}

	@ApiOperation("Used to delete employee with particular id")
	@DeleteMapping("/employees/{empId}")
	public EmployeeDto deleteEmployee(@PathVariable long empId) {
		return es.deleteEmployee(empId);
	}

}
