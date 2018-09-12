package com.project.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.bean.StudentBean;
import com.project.dao.IEmployManagementDao;

public class TestDemo {
	
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IEmployManagementDao dao = (IEmployManagementDao) context.getBean(IEmployManagementDao.class);
		List<StudentBean> list = dao.findAllWaitedStudent();
		System.out.println(list);
	}
}
