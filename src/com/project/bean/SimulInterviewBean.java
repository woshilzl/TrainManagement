package com.project.bean;

import java.util.Date;

/**
 * 模拟面试表实体
 * @author 王森
 *
 */
public class SimulInterviewBean {
	/**
	 * 模拟面试表id
	 */
	private int id;
	
	/**
	 * 面试时间
	 */
	private Date date;
	
	/**
	 * 面试备注
	 */
	private String comment;
	
	/**
	 * 沟通能力
	 */
	private String ability;
	
	/**
	 * 学员对象
	 */
	private StudentBean stu;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public StudentBean getStu() {
		return stu;
	}

	public void setStu(StudentBean stu) {
		this.stu = stu;
	}
	
}
