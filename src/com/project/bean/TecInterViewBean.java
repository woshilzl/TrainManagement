package com.project.bean;

import java.util.Date;

/**
 * 技术面试表实体
 * @author 王森
 *
 */
public class TecInterViewBean {
	/**
	 * 技术面试表id
	 */
	private int id;
	
	/**
	 * 面试题
	 */
	private String question;
	
	/**
	 * 面试时间
	 */
	private Date date;
	
	/**
	 * 面试评价
	 */
	private String view;
	
	/**
	 * 面试状态
	 */
	private String status;

//	/**
//	 * 学员对象
//	 */
//	private StudentBean stu;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

//	public StudentBean getStu() {
//		return stu;
//	}
//
//	public void setStu(StudentBean stu) {
//		this.stu = stu;
//	}
	
}
