package com.project.service.impl;

import java.util.List;

import com.project.bean.StudentBean;
import com.project.bean.TecInterViewBean;
import com.project.dao.ITecInterViewDao;
import com.project.dao.impl.TecInterViewDaoImp;
import com.project.service.ITecInterViewService;

/**
 * 技术面试实现类
 * @author SEN
 *
 */
public class TecInterViewServiceImp implements ITecInterViewService{
	
	ITecInterViewDao dao=new TecInterViewDaoImp();
	
	@Override
	public List<StudentBean> showStudent(String status,StudentBean bean) {
		List<StudentBean> list=null;
		
		list=dao.findStuByStatusAndInfo(status,bean);
	
		return list;
	}


	@Override
	public void interview(TecInterViewBean bean) {
		dao.addTecInterView(bean);
	}

}
