package com.project.dao;

import java.util.List;

import com.project.bean.StudentBean;

public interface IEmployManagementDao {

	public List<StudentBean> findAllWaitedStudent();

}
