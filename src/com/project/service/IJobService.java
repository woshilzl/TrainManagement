package com.project.service;

import java.util.List;
import com.project.bean.JobBean;

/**
 * 该接口用于处理就业管理模块中就业情况的业务逻辑，定义相应的接口
 * @author 李治龙
 *
 */
public interface IJobService {
	/**
	 * 查找所有就业信息，返回List集合
	 * @return List<JobBean>
	 */
	public List<JobBean> findAllJobInformation(); 
	
	/**
	 * 添加一条就业信息，返回布尔用于检查添加是否成功
	 * @param JobBean
	 * @return boolean
	 */
	public boolean addJobInformation(JobBean job);
}
