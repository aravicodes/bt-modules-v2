package com.bugtracking.bug.services;

import java.util.List;

import com.bugtracking.bug.dto.BugDto;
import com.bugtracking.bug.enums.bugstatus;

public interface IBugService {

	List<BugDto> getall();

	BugDto getbug(long bugId);

	BugDto deletebug(long bugId);

	BugDto createbug(BugDto bugDto);

	BugDto updatebug(long bugId, BugDto bugDto);

	List<BugDto> getbugsbystatus(bugstatus bugStatus);

}
