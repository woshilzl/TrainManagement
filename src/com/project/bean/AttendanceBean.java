package com.project.bean;

import java.sql.Date;

/**
 * 考勤表
 * @author 陈炫华
 *
 */
public class AttendanceBean {
	/**
	 * 考勤表id
	 */
	private int id;
	
	/**
	 * 考勤表学生id
	 */
	private StudentBean stu;
	
	/**
	 * 考勤表学生考勤状态
	 */
	private String status;
	
	/**
	 * 考勤时间
	 */
	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public StudentBean getStu() {
		return stu;
	}

	public void setStu(StudentBean stu) {
		this.stu = stu;
	}
	
}
