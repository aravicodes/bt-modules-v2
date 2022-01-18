package com.bugtracking.bug.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtracking.bug.bean.Bug;
import com.bugtracking.bug.enums.bugstatus;

@Repository("br")
public interface IBugRepository extends JpaRepository<Bug, Long> {

	List<Bug> findByBugStatus(bugstatus bugstatus);

}