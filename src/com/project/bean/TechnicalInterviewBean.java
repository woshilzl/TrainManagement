package com.project.bean;

import java.util.Date;

public class TechnicalInterviewBean {
	private int id;
	private String tec_status;
	private String tec_question;
	private Date tec_date;
	private String tec_comment;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTec_status() {
		return tec_status;
	}
	public void setTec_status(String tec_status) {
		this.tec_status = tec_status;
	}
	public String getTec_question() {
		return tec_question;
	}
	public void setTec_question(String tec_question) {
		this.tec_question = tec_question;
	}
	public Date getTec_date() {
		return tec_date;
	}
	public void setTec_date(Date tec_date) {
		this.tec_date = tec_date;
	}
	public String getTec_comment() {
		return tec_comment;
	}
	public void setTec_comment(String tec_comment) {
		this.tec_comment = tec_comment;
	}
	
}
