package com.project.bean;

public class ClassBean {
	private int c_id;
	private String c_name;
	private PeriodBean period;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public PeriodBean getPeriod() {
		return period;
	}
	public void setPeriod(PeriodBean period) {
		this.period = period;
	}
	@Override
	public String toString() {
		return "ClassBean [c_id=" + c_id + ", c_name=" + c_name + ", period=" + period + "]";
	}
	
}
