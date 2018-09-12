package com.project.service;

import java.util.List;

import com.project.bean.StudentBean;
import com.project.bean.TecInterViewBean;

/**
 * 技术面试接口
 * @author SEN
 *
 */
public interface ITecInterViewService {
	
	/**
	 * 显示学员信息，参数用来判断要显示学员的范围
	 * @param status 值：全部、通过、未通过
	 * @param bean 学生实体用来保存查询条件
	 * @return
	 */
	public List<StudentBean> showStudent(String status,StudentBean bean);
	
	
	/**
	 * 面试
	 * @param bean 技术面试实体
	 */
	public void interview(TecInterViewBean bean);
	
}
