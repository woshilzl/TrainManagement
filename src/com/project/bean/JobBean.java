package com.project.bean;

import java.util.Date;
/**
 * 该实体和数据库t_job表对应，且属性名和数据库列名已经保持一致
 * @author Administrator
 *
 */
public class JobBean {
	private int j_id;
	private Date j_date;
	private String j_position;
	private double j_salary;
	private String j_company;
	// 缺少一个StudentBean对象，是学生管理模块定义的实体，后续需要添加
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
