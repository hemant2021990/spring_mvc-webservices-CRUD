package com.sapp.service;

import java.util.List;

import com.sapp.core.domain.Student;

public interface IStudentService {
	public void saveStudent(Student student);
	public List<Student> getAll();
	public Student getStudent(int id);
	public void deleteStudent(int id);
	public void updateStudent(Student student);
}
