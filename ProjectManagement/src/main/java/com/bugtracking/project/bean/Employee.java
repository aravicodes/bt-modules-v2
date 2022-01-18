package com.bugtracking.project.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel("Employee Entity")
public class Employee {
	@Id
	@Min(value = 1, message = "minimum value must be 1")
	private long empId;
	@ApiModelProperty("Employee name should not be empty")
	@NotEmpty
	public String empName;
	@ApiModelProperty("Employee email should not be empty")
	@NotEmpty
	private String empEmail;
	@ApiModelProperty("Employee contactno should not be empty")
	@NotEmpty
	private String empContactNo;

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpContactNo() {
		return empContactNo;
	}

	public void setEmpContactNo(String empContactNo) {
		this.empContactNo = empContactNo;
	}


	public Employee() {

	}

	public Employee(long empId, String empName, String empEmail, String empContactNo) {
		super();
		this.empId = empId;
		this.empEmail = empEmail;
		this.empName = empName;
		this.empContactNo = empContactNo;
	}

}
