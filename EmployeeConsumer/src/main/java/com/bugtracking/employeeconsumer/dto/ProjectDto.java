package com.bugtracking.employeeconsumer.dto;

import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModelProperty;

public class ProjectDto {
//	@Id
	//@Min(value = 1, message = "minimum value must be 1")
	private long projId;
	//@NotEmpty
	@ApiModelProperty("Project Name should not be empty")
	private String projName;
//	@OneToMany
	private List<EmployeeDto> members;
	//@NotEmpty
	@ApiModelProperty("Project status should not be empty")
	private String projStatus;

	public long getProjId() {
		return projId;
	}

	public void setProjId(long projId) {
		this.projId = projId;
	}

//	public List<Employee> getMembers() {
//		return members;
//	}
//
//	public void setMembers(List<Employee> members) {
//		this.members = members;
//	}
//
//	public String getProjname() {
//		return projName;
//	}
//
//	public void setProjname(String projName) {
//		this.projName = projName;
//	}
//
//	public String getProjstatus() {
//		return projStatus;
//	}
//
//	public void setProjstatus(String projStatus) {
//		this.projStatus = projStatus;
//	}

	public ProjectDto() {

	}

	public ProjectDto(long projId, String projName, List<EmployeeDto> members, String projStatus) {
		super();
		this.projId = projId;
		this.projName = projName;
		this.members = members;
		this.projStatus = projStatus;
	}

}
