package com.bugtracking.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtracking.project.bean.Project;

@Repository("rs")
public interface IProjectRepository extends JpaRepository<Project, Long>{

}
