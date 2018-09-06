package com.project.bean;

import java.util.Date;

public class JobBean {
	private int id;
	private Date job_date;
	private String job_company;
	private String job_position;
	private double job_pay;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getJob_date() {
		return job_date;
	}
	public void setJob_date(Date job_date) {
		this.job_date = job_date;
	}
	public String getJob_company() {
		return job_company;
	}
	public void setJob_company(String job_company) {
		this.job_company = job_company;
	}
	public String getJob_position() {
		return job_position;
	}
	public void setJob_position(String job_position) {
		this.job_position = job_position;
	}
	public double getJob_pay() {
		return job_pay;
	}
	public void setJob_pay(double job_pay) {
		this.job_pay = job_pay;
	}
	
	
	
}
