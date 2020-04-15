package com.spiderweb.attendance;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;
	
	@GetMapping("/candidateAndClientInfo")
	public void  getCandidateAndClientInfo(){
		attendanceService.getCandidateAndClientInfo();
	}
}
