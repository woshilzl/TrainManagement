package com.project.service;

public interface ITecInterViewService {
	
	/**
	 * 显示学员信息，参数用来判断要显示学员的范围
	 * @param status 值：全部、通过、未通过
	 * @return
	 */
	public StudentBean showStudent(String status);
	
}
