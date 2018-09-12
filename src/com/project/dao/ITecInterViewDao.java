package com.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.project.bean.StudentBean;
import com.project.bean.TecInterViewBean;

/**
 * 技术面试持久层实现类
 * @author SEN
 *
 */
public interface ITecInterViewDao {
    
	/**
	 * 通过状态查询学员
	 * @param status 通过、未通过
	 * @param bean 学生实体用来保存查询条件
	 * @return
	 */
	public List<StudentBean> findStuByStatusAndInfo(@Param("sta")String status,@Param("stu")StudentBean bean);
	
	/**
	 * 添加技术面试
	 * @param bean
	 */
	public void addTecInterView(TecInterViewBean bean);
}
