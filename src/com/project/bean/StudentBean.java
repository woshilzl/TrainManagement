package com.project.bean;
/**
 * @author 杨阳
 * 学生的bean对象
 * */
public class StudentBean {
	// 主键id
	private int id;
	// 姓名
	private String name;
	// 学习方向
	private String direction;
	// 所属班级（内包含学生的讲师和班主任）
	private ClassBean cb;
	// 学号
	private String stuNum;
	// 学生详细信息
	private StudentInfoBean stuinfo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public ClassBean getCb() {
		return cb;
	}
	public void setCb(ClassBean cb) {
		this.cb = cb;
	}
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public StudentInfoBean getStuinfo() {
		return stuinfo;
	}
	public void setStuinfo(StudentInfoBean stuinfo) {
		this.stuinfo = stuinfo;
	}
	
}
