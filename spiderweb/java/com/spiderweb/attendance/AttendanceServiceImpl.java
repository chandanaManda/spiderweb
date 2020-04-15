package com.spiderweb.attendance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spiderweb.attendance.jpa.LeaveCandidateClientRepository;
import com.spiderweb.attendance.jpa.LeaveTypeRepository;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	private LeaveTypeRepository  leaveTypeRepository;
	
	@Autowired
	private LeaveCandidateClientRepository leaveCandidateClientRepository;
	
	@Override
	public void getCandidateAndClientInfo() {
		leaveTypeRepository.findAll();		
	}

}
