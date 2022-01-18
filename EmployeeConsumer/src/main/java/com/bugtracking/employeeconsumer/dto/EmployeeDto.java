package com.bugtracking.employeeconsumer.dto;



public class EmployeeDto {
	private long empId;
	private String empEmail;
	private String empContactNo;
	private String empName;
	private String projectId;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public EmployeeDto(long empId, String empEmail, String empContactNo, String empName, String projectId) {
		super();
		this.empId = empId;
		this.empEmail = empEmail;
		this.empContactNo = empContactNo;
		this.empName = empName;
		this.projectId = projectId;
	}
	
//	public String getEmpEmail() {
//		return empEmail;
//	}
//	public void setEmpEmail(String empEmail) {
//		this.empEmail = empEmail;
//	}
//	public String getEmpContactNo() {
//		return empContactNo;
//	}
//	public void setEmpContactNo(String empContactNo) {
//		this.empContactNo = empContactNo;
//	}
//	public String getEmpName() {
//		return empName;
//	}
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	public String getProjectId() {
//		return projectId;
//	}
//	public void setProjectId(String projectId) {
//		this.projectId = projectId;
//	}
	public EmployeeDto() {
		
	}
	
}