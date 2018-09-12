package com.project.dao.impl;


import java.util.List;

import com.project.bean.StudentBean;
import com.project.bean.TecInterViewBean;
import com.project.dao.ITecInterViewDao;

/**
 * 技术面试持久层实现类
 * @author SEN
 *
 */
public class TecInterViewDaoImp implements ITecInterViewDao {


	@Override
	public List<StudentBean> findStuByStatusAndInfo(String status, StudentBean bean) {
		
		return null;
	}

	@Override
	public void addTecInterView(TecInterViewBean bean) {
		
		
	}


}
