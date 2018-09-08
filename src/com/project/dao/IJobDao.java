package com.project.dao;

import java.util.List;

import com.project.bean.JobBean;

/**
 * 该dao接口处理就业部分的持久层操作，负责定义数据库t_job表的增删改查操作的接口方法
 * @author 李治龙
 *
 */
public interface IJobDao {
	/**
	 * 查找所有已经就业的学员信息，返回包含JobBean对象的List集合
	 */
	public List<JobBean> findAllJobInformation();
	
	/**
	 * 添加一条就业记录，参数为JobBean，没有返回值
	 */
	public void addJobInformation();
	
	/**
	 * 通过学生信息查询学生就业情况，返回JobBean对象
	 */
	public JobBean findJobInformationByStudentBean(int s_id);
}
