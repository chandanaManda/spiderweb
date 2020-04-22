package com.spiderweb.attendance.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attendance_candidate_client")

public class attendanceCandidateclient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int atten_id;
	private int client_id;
	private int candidate_id;
	private String atten_from_dt;
	private String atten_to_dt;
	private int atten_mon_hrs;
	private int atten_tue_hrs;
	private int atten_wed_hrs;
	private int atten_thurs_hrs;
	private int atten_fri_hrs;
	private int atten_sat_hrs;
	private int atten_sun_hrs;
	private String submitted_by;
	private String submitted_date;
	private String updated_by;
	private String updated_date;

	public int getAtten_id() {
		return atten_id;
	}

	public void setAtten_id(int atten_id) {
		this.atten_id = atten_id;
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

	public String getAtten_from_dt() {
		return atten_from_dt;
	}

	public void setAtten_from_dt(String atten_from_dt) {
		this.atten_from_dt = atten_from_dt;
	}

	public String getAtten_to_dt() {
		return atten_to_dt;
	}

	public void setAtten_to_dt(String atten_to_dt) {
		this.atten_to_dt = atten_to_dt;
	}

	public int getAtten_mon_hrs() {
		return atten_mon_hrs;
	}

	public void setAtten_mon_hrs(int atten_mon_hrs) {
		this.atten_mon_hrs = atten_mon_hrs;
	}

	public int getAtten_tue_hrs() {
		return atten_tue_hrs;
	}

	public void setAtten_tues_hrs(int atten_tue_hrs) {
		this.atten_tue_hrs = atten_tue_hrs;
	}

	public int getAtten_wed_hrs() {
		return atten_wed_hrs;
	}

	public void setAtten_wed_hrs(int atten_wed_hrs) {
		this.atten_wed_hrs = atten_wed_hrs;
	}

	public int getAtten_thurs_hrs() {
		return atten_thurs_hrs;
	}

	public void setAtten_thurs_hrs(int atten_thurs_hrs) {
		this.atten_thurs_hrs = atten_thurs_hrs;
	}

	public int getAtten_fri_hrs() {
		return atten_fri_hrs;
	}

	public void setAtten_fri_hrs(int atten_fri_hrs) {
		this.atten_fri_hrs = atten_fri_hrs;
	}

	public int getAtten_sat_hrs() {
		return atten_sat_hrs;
	}

	public void setAtten_sat_hrs(int atten_sat_hrs) {
		this.atten_sat_hrs = atten_sat_hrs;
	}

	public int getAtten_sun_hrs() {
		return atten_sun_hrs;
	}

	public void setAtten_sun_hrs(int atten_sun_hrs) {
		this.atten_sun_hrs = atten_sun_hrs;
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
		return "attendanceCandidateclient [atten_id=" + atten_id + ", client_id=" + client_id + ", candidate_id="
				+ candidate_id + ", atten_from_dt=" + atten_from_dt + ", atten_to_dt=" + atten_to_dt
				+ ", atten_mon_hrs=" + atten_mon_hrs + ", atten_tues_hrs=" + atten_tues_hrs + ", atten_wed_hrs="
				+ atten_wed_hrs + ", atten_thurs_hrs=" + atten_thurs_hrs + ", atten_fri_hrs=" + atten_fri_hrs
				+ ", atten_sat_hrs=" + atten_sat_hrs + ", atten_sun_hrs=" + atten_sun_hrs + ", submitted_by="
				+ submitted_by + ", submitted_date=" + submitted_date + ", updated_by=" + updated_by + ", updated_date="
				+ updated_date + "]";
	}
	

}
