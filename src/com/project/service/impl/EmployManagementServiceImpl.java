package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.StudentBean;
import com.project.dao.IEmployManagementDao;
import com.project.service.IEmployManagementService;

@Service
public class EmployManagementServiceImpl implements IEmployManagementService {

	@Autowired
	private IEmployManagementDao dao;
	
	@Override
	public List<StudentBean> findAllWaitedStudent() {
		List<StudentBean> list =dao.findAllWaitedStudent();
		return list;
	}

}
