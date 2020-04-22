package com.spiderweb.attendance.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leave_candidate_client")

public class leaveCandidateclient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leave_id;
	private int client_id;
	private int candidate_id;
	private int leave_type_id;
	private String leave_from_dt;
	private String leave_to_dt;
	private String leave_reason;
	private int leave_hours;
	private String submitted_by;
	private String submitted_date;
	private String updated_by;
	private String updated_date;

	public int getLeave_id() {
		return leave_id;
	}

	public void setLeave_id(int leave_id) {
		this.leave_id = leave_id;
	}

	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public int getCandidate_id() {
		return candidate_id;
	}

	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}

	public int getLeave_type_id() {
		return leave_type_id;
	}

	public void setLeave_type_id(int leave_type_id) {
		this.leave_type_id = leave_type_id;
	}

	public String getLeave_from_dt() {
		return leave_from_dt;
	}

	public void setLeave_from_dt(String leave_from_dt) {
		this.leave_from_dt = leave_from_dt;
	}

	public String getLeave_to_dt() {
		return leave_to_dt;
	}

	public void setLeave_to_dt(String leave_to_dt) {
		this.leave_to_dt = leave_to_dt;
	}

	public String getLeave_reason() {
		return leave_reason;
	}

	public void setLeave_reason(String leave_reason) {
		this.leave_reason = leave_reason;
	}

	public int getLeave_hours() {
		return leave_hours;
	}

	public void setLeave_hours(int leave_hours) {
		this.leave_hours = leave_hours;
	}

	public String getSubmitted_by() {
		return submitted_by;
	}

	public void setSubmitted_by(String submitted_by) {
		this.submitted_by = submitted_by;
	}

	public String getSubmitted_date() {
		return submitted_date;
	}

	public void setSubmitted_date(String submitted_date) {
		this.submitted_date = submitted_date;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public String getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "leaveCandidateclient [leave_id=" + leave_id + ", client_id=" + client_id + ", candidate_id="
				+ candidate_id + ", leave_type_id=" + leave_type_id + ", leave_from_dt=" + leave_from_dt
				+ ", leave_to_dt=" + leave_to_dt + ", leave_reason=" + leave_reason + ", leave_hours=" + leave_hours
				+ ", submitted_by=" + submitted_by + ", submitted_date=" + submitted_date + ", updated_by=" + updated_by
				+ ", updated_date=" + updated_date + "]";
	}
	
}
