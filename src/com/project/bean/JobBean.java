package com.project.bean;

import java.util.Date;
/**
 * 该实体和数据库t_job表对应，且属性名和数据库列名已经保持一致
 * @author 李治龙
 *
 */
public class JobBean {
	
	/**
	 * 对应入职信息表的主键
	 */
	private int j_id;
	
	/**
	 * 对应入职日期
	 */
	private Date j_date;
	
	/**
	 * 对应入职岗位
	 */
	private String j_position;
	
	/**
	 * 对应入职薪资
	 */
	private double j_salary;
	
	/**
	 * 对应入职企业
	 */
	private String j_company;
	
	/**
	 * 对应入职学员信息（数据库学生表的主键引用）
	 */
	private StudentBean student;
	
	public StudentBean getStudent() {
		return student;
	}
	public void setStudent(StudentBean student) {
		this.student = student;
	}
	public int getJ_id() {
		return j_id;
	}
	public void setJ_id(int j_id) {
		this.j_id = j_id;
	}
	public Date getJ_date() {
		return j_date;
	}
	public void setJ_date(Date j_date) {
		this.j_date = j_date;
	}
	public String getJ_position() {
		return j_position;
	}
	public void setJ_position(String j_position) {
		this.j_position = j_position;
	}
	public double getJ_salary() {
		return j_salary;
	}
	public void setJ_salary(double j_salary) {
		this.j_salary = j_salary;
	}
	public String getJ_company() {
		return j_company;
	}
	public void setJ_company(String j_company) {
		this.j_company = j_company;
	}
	
	
}
