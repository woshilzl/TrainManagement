package com.project.bean;

/**
 * 阶段成绩实体
 * @author 徐政 
 *
 */
public class PeriodExamBean {
  
	/**
	 * 阶段考核表主键
	 */
	 private int peid;
	 /**
	  * 外键，与学生表关联
	  */
	 private StudentBean studentBean;
	 /**
	  * 外键，与阶段表关联
	  */
	 private PeriodBean periodBean;
	 /**
	  * 阶段考核分数
	  */
	 private double score;
	 /**
	  * 阶段考核评语
	  */
	 private String comment;
	 /**
	  * 阶段考核是否通过
	  */
	 private String status;
	public int getPeid() {
		return peid;
	}
	public void setPeid(int peid) {
		this.peid = peid;
	}
	public StudentBean getStudentBean() {
		return studentBean;
	}
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	public PeriodBean getPeriodBean() {
		return periodBean;
	}
	public void setPeriodBean(PeriodBean periodBean) {
		this.periodBean = periodBean;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	 
	 
	 
}
