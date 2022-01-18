package com.bugtracking.employee.controllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.bugtracking.employee.bean.Employee;
import com.bugtracking.employee.controller.EmployeeController;
import com.bugtracking.employee.dto.EmployeeDto;
import com.bugtracking.employee.services.IEmployeeService;

public class EmployeeControllerTest {
	long empId;
	@Mock
	public EmployeeDto employeeDto;

	@SuppressWarnings("deprecation")
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);

		employeeDto.setEmpId(1);
		employeeDto.setEmpName("aravi");
		employeeDto.setEmpEmail("aravicoder@gmail.com");
		employeeDto.setEmpContactNo("8123456789");
	}

	@InjectMocks
	EmployeeController employeeController;

	@Mock
	IEmployeeService employeeService;

	@Mock
	List<EmployeeDto> employeeDtolist;
	@Mock
	Employee employee;

	@Test
	void testAddEmployee() {
		Mockito.when(employeeService.createEmployee(employeeDto)).thenReturn(employeeDto);
		assertEquals(employeeDto, employeeController.createEmployee(employeeDto));
		Mockito.verify(employeeService).createEmployee(employeeDto);
	}

	@Test
	void testGetEmployee() {
		when(employeeService.getEmployee(empId)).thenReturn(employeeDto);
		assertEquals(employeeDto, employeeController.readEmployee(empId));
		verify(employeeService).getEmployee(empId);
	}

	@Test
	void testGetAllEmployee() {
		when(employeeService.getAllEmployees()).thenReturn(employeeDtolist);
		assertEquals(employeeDtolist, employeeController.readAllEmployees());
		verify(employeeService).getAllEmployees();
	}

	@Test
	void testUpdateEmployee() {
		when(employeeService.updateEmployee(empId, employeeDto)).thenReturn(employeeDto);
		assertEquals(employeeDto, employeeController.updateEmployee(empId, employeeDto));
		verify(employeeService).updateEmployee(empId, employeeDto);
	}

	@Test
	void testDeleteEmployee() {
		when(employeeService.deleteEmployee(12)).thenReturn(employeeDto);
		assertEquals(employeeDto, employeeController.deleteEmployee(12));
		verify(employeeService).deleteEmployee(12);

	}

}