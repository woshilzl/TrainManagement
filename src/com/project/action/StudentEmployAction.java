package com.project.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.bean.StudentBean;
import com.project.service.IEmployManagementService;

@Controller
@RequestMapping("/test")
public class StudentEmployAction {
	@Autowired
	private IEmployManagementService service;
	
	@RequestMapping("/findAll.action")
	public String findAllWaitedStudent(){
		List<StudentBean> student = service.findAllWaitedStudent();
		for (StudentBean tempstudent : student) {
			System.out.println(tempstudent);
		}
		return null;
	}
}
