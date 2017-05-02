package com.sapp.core.dao;

import java.util.List;

import com.sapp.core.domain.Student;

public interface IStudentDao {
	public void saveStudent(Student student);
	public List<Student> getAll();
	public Student getStudent(int id);
	public void deleteStudent(int id);
	public void updateStudent(Student student);
}
