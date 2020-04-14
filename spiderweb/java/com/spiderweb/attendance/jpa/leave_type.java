package com.spiderweb.attendance.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "leave_type")


public class leave_type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leave_type_id;
	public int getLeave_type_id() {
		return leave_type_id;
	}
	public void setLeave_type_id(int leave_type_id) {
		this.leave_type_id = leave_type_id;
	}
	public String getLeave_short_desc() {
		return leave_short_desc;
	}
	public void setLeave_short_desc(String leave_short_desc) {
		this.leave_short_desc = leave_short_desc;
	}
	public String getLeave_desc() {
		return leave_desc;
	}
	public void setLeave_desc(String leave_desc) {
		this.leave_desc = leave_desc;
	}
	private String leave_short_desc;
	private String leave_desc;

}
