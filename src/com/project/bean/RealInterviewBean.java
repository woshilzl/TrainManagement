package com.project.bean;

import java.util.Date;
/**
 * 该实体已经和数据库t_really_interview表关联，且属性名和数据库列名已经保持一致
 * @author 李治龙
 *
 */
public class RealInterviewBean {
	/**
	 * 对应真实面试表的主键
	 */
	private int ri_id;
	
	/**
	 * 对应真实面试时间
	 */
	private Date ri_date;
	
	/**
	 * 对应真实面试企业
	 */
	private String ri_company;
	
	/**
	 * 对应真实面试职位
	 */
	private String ri_position;
	
	/**
	 * 对应真实面试结果
	 */
	private String ri_result;
	
	/**
	 * 对应真实面试反馈
	 */
	private String ri_comment;
	
	/**
	 * 对应真实面试学员信息（数据库学生表的主键引用）
	 */
	private StudentBean student;
	
	
	public StudentBean getStudent() {
		return student;
	}
	public void setStudent(StudentBean student) {
		this.student = student;
	}
	public int getRi_id() {
		return ri_id;
	}
	public void setRi_id(int ri_id) {
		this.ri_id = ri_id;
	}
	public Date getRi_date() {
		return ri_date;
	}
	public void setRi_date(Date ri_date) {
		this.ri_date = ri_date;
	}
	public String getRi_company() {
		return ri_company;
	}
	public void setRi_company(String ri_company) {
		this.ri_company = ri_company;
	}
	public String getRi_position() {
		return ri_position;
	}
	public void setRi_position(String ri_position) {
		this.ri_position = ri_position;
	}
	public String getRi_result() {
		return ri_result;
	}
	public void setRi_result(String ri_result) {
		this.ri_result = ri_result;
	}
	public String getRi_comment() {
		return ri_comment;
	}
	public void setRi_comment(String ri_comment) {
		this.ri_comment = ri_comment;
	}
	
}
