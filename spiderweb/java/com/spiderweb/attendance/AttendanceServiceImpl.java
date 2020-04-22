package com.spiderweb.attendance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spiderweb.attendance.jpa.LeaveCandidateClientRepository;
import com.spiderweb.attendance.jpa.LeaveTypeRepository;
import com.spiderweb.attendance.jpa.attendanceCandidateclient;
import com.spiderweb.attendance.jpa.attendanceCandidateclientRepository;
import com.spiderweb.attendance.jpa.leaveCandidateclient;
import com.spiderweb.attendance.jpa.leaveType;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	private LeaveTypeRepository  leaveTypeRepository;
	
	@Autowired
	private LeaveCandidateClientRepository leaveCandidateClientRepository;
	@Autowired
	private attendanceCandidateclientRepository AttendanceCandidateclientRepository;


	@Override
	public List<attendanceCandidateclient> getattendanceCandidateclient() {
		// TODO Auto-generated method stub
		return AttendanceCandidateclientRepository.findAll();
	}

	@Override
	public List<leaveCandidateclient> getleaveCandidateclient() {
		
		return leaveCandidateClientRepository.findAll();
	}

	@Override
	public List<leaveType> getleaveType() {
		// TODO Auto-generated method stub
		return leaveTypeRepository.findAll();
	}

}
