package com.project.bean;

public class StudentBean {
	private int s_id;
	private String s_name;
	private String s_direction;
	private String s_no;
	private ClassBean classbean;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_direction() {
		return s_direction;
	}
	public void setS_direction(String s_direction) {
		this.s_direction = s_direction;
	}
	public String getS_no() {
		return s_no;
	}
	public void setS_no(String s_no) {
		this.s_no = s_no;
	}
	public ClassBean getClassbean() {
		return classbean;
	}
	public void setClassbean(ClassBean classbean) {
		this.classbean = classbean;
	}
	@Override
	public String toString() {
		return "StudentBean [s_id=" + s_id + ", s_name=" + s_name + ", s_direction=" + s_direction + ", s_no=" + s_no
				+ ", classbean=" + classbean + "]";
	}
	
}
