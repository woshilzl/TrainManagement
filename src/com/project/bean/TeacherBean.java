package com.project.bean;

/**
 * @author 杨阳
 * 讲师表的bean对象
 * */
public class TeacherBean {
	// 主键ID
	private int id;
	// 讲师姓名
	private String teacherName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
}
