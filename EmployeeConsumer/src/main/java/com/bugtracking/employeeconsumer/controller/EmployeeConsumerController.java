package com.bugtracking.employeeconsumer.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bugtracking.employeeconsumer.dto.BugDto;
import com.bugtracking.employeeconsumer.enums.bugstatus;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RestController
public class EmployeeConsumerController {
	
	RestTemplate rt = new RestTemplate();
	

	@ApiOperation("Used to create bug(BY EMPLOYEE)")
	@PostMapping("/employees/bugs")
	public String createBug(@Valid @RequestBody BugDto b) {
		String endpointBug = "http://localhost:8091/bugs/";
		rt.postForLocation(endpointBug, b);
		return "created successfully";
	}

	@ApiOperation("Used to fetch bugs by status(BY ADMIN)")
	@GetMapping("/employees/bugs/bystatus/{bugStatus}")
	public List<BugDto> readBugsByStatus(@PathVariable bugstatus bugStatus) {
		String endpointBugsByStatus = "http://localhost:8091/bugs/bystatus/" + bugStatus;
		return Arrays.asList(rt.getForObject(endpointBugsByStatus, BugDto[].class));
	}

}
