package com.spiderweb.attendance;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.spiderweb.attendance.jpa.attendanceCandidateclient;

import com.spiderweb.attendance.jpa.leaveCandidateclient;
import com.spiderweb.attendance.jpa.leaveType;


@RestController
public class AttendanceController {

	@Autowired
	private AttendanceServiceImpl attendanceService;
	
	@GetMapping("/attendanceCandidateclientInfo")
	public List<attendanceCandidateclient>  getattendanceCandidateclient(){
		return attendanceService.getattendanceCandidateclient();
	}
	@GetMapping("/leaveCandidateclientInfo")
	public List<leaveCandidateclient>  getleaveCandidateclient(){
		return attendanceService.getleaveCandidateclient();
	}
		@GetMapping("/leaveTypeInfo")
		public List<leaveType> getleaveType(){
			return attendanceService.getleaveType();
}
}
