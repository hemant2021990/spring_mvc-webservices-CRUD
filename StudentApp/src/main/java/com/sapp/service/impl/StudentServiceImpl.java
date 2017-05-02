package com.sapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapp.core.dao.IStudentDao;
import com.sapp.core.domain.Student;
import com.sapp.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private IStudentDao dao;
	
	@Override
	public void saveStudent(Student student) {
		dao.saveStudent(student);	
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return dao.getStudent(id);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		dao.deleteStudent(id);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		dao.updateStudent(student);
	}

}
