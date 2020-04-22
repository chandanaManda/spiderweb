package com.spiderweb.attendance;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spiderweb.attendance.jpa.attendanceCandidateclient;
import com.spiderweb.attendance.jpa.leaveCandidateclient;
import com.spiderweb.attendance.jpa.leaveType;

@Service
public interface AttendanceService {
	
	List<attendanceCandidateclient>  getattendanceCandidateclient();
	List<leaveCandidateclient>  getleaveCandidateclient();
	List<leaveType> getleaveType();

}
