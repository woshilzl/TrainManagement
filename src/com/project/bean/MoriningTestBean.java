package com.project.bean;

import java.sql.Date;

/**
 * 晨考成绩实体
 * 
 * @author 徐政
 *
 */
public class MoriningTestBean {
	/**
	 * 晨考表主键
	 */
	private int mtid;
	/**
	 * 晨考表外键，与学生表关联
	 */
	private StudentBean studentBean;
	/**
	 * 晨考题
	 */
	private String question;
	/**
	 * 晨考分数
	 */
	private double score;
	/**
	 * 晨考时间
	 */
	private Date date;
	public int getMtid() {
		return mtid;
	}
	public void setMtid(int mtid) {
		this.mtid = mtid;
	}
	public StudentBean getStudentBean() {
		return studentBean;
	}
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	

}
