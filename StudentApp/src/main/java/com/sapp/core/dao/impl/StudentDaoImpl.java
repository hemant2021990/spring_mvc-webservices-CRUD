package com.sapp.core.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.sapp.core.dao.IStudentDao;
import com.sapp.core.domain.Student;
@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private SessionFactory sessionFactory;
@Override
public void saveStudent(Student student) {
	Session session=sessionFactory.openSession();
	session.save(student);
	session.beginTransaction().commit();
	
}
@Override
public List<Student> getAll() {
	// TODO Auto-generated method stub
	Session session=sessionFactory.openSession();
	return session.createCriteria(Student.class).list();
}
@Override
public Student getStudent(int id) {
	// TODO Auto-generated method stub
	Session session=sessionFactory.openSession();
	
	return (Student)session.createQuery("from Student where sid=?").setParameter(0, id).uniqueResult();
}
@Override
public void deleteStudent(int id) {
	// TODO Auto-generated method stub
	Session session=sessionFactory.openSession();
	Student s=(Student) session.get(Student.class, id);
		session.delete(s);
	session.beginTransaction().commit();
}
@Override
public void updateStudent(Student student) {
	// TODO Auto-generated method stub
	Session session=sessionFactory.openSession();
	session.update(student);
	session.beginTransaction().commit();
}
}
