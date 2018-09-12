package com.project.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.bean.StudentBean;
import com.project.dao.IEmployManagementDao;

@Repository
public class EmployManagementDaoImpl implements IEmployManagementDao {

	@Autowired
	private SqlSessionFactory fa;
	
	@Override
	public List<StudentBean> findAllWaitedStudent() {
		SqlSession session = fa.openSession();
		List<StudentBean> list = null;
		try{
			IEmployManagementDao dao =session.getMapper(IEmployManagementDao.class);
			list = dao.findAllWaitedStudent();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

}
