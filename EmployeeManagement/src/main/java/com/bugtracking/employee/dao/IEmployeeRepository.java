package com.bugtracking.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtracking.employee.bean.Employee;

@Repository("er")
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
