package com.bugtracking.project.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugtracking.project.bean.Project;
import com.bugtracking.project.dao.IProjectRepository;
import com.bugtracking.project.exceptions.IdNotFoundException;

@Transactional
@Service("ps")
public class ProjectServiceImpl implements IProjectService {

	@Autowired
	IProjectRepository pr;

	@Override
	public List<Project> getall() {
		return pr.findAll();
	}

	@Override
	public Project getproject(long projId) {
		java.util.Optional<Project> proj = pr.findById(projId);
		if (proj.isPresent())
			return proj.get();
		else {
			throw new IdNotFoundException("Id not found");
		}

	}

	@Override
	public Project deleteproject(long projId) {
		if (pr.existsById(projId)) {
			Project prj = pr.getById(projId);
			pr.deleteById(projId);
			return prj;
		} else {
			throw new IdNotFoundException("Id not found");
		}

	}

	@Override
	public Project createproject(Project p) {
		return pr.save(p);
	}

	@Override
	public Project updateproject(long projId, Project p) {
		if (pr.existsById(projId)) {

			return pr.save(p);
		} else {
			throw new IdNotFoundException("Provided id is not there");
		}
	}
}
