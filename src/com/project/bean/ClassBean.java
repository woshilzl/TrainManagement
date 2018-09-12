package com.project.bean;

import java.util.List;

/**
 * @author 杨阳
 * 班级表的bean对象
 * */
public class ClassBean {
	// 主键班级ID
	private int cId;
	// 班级名称
	private String className;
	// 班级阶段
	private PeriodBean period;
	// 班级讲师
	private TeacherBean teacher;
	// 班主任
	private HeadTeacherBean headTeacher;
	// 学生
	private List<StudentBean> stulist;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public PeriodBean getPeriod() {
		return period;
	}
	public void setPeriod(PeriodBean period) {
		this.period = period;
	}
	public TeacherBean getTeacher() {
		return teacher;
	}
	public void setTeacher(TeacherBean teacher) {
		this.teacher = teacher;
	}
	public HeadTeacherBean getHeadTeacher() {
		return headTeacher;
	}
	public void setHeadTeacher(HeadTeacherBean headTeacher) {
		this.headTeacher = headTeacher;
	}
	public List<StudentBean> getStulist() {
		return stulist;
	}
	public void setStulist(List<StudentBean> stulist) {
		this.stulist = stulist;
	}
	
}
