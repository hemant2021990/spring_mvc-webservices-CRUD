package com.sapp.web;

import java.util.List;

import javax.xml.ws.ResponseWrapper;

import org.codehaus.jackson.annotate.JsonCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sapp.core.domain.Student;
import com.sapp.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private IStudentService service;
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(value=HttpStatus.OK)

	public List<Student> getAll()
	{
		System.out.println("hello");
		//service.saveStudent(student);
		return service.getAll();
	}
	
	
	@ResponseBody
	@ResponseStatus(value=HttpStatus.OK)
	@RequestMapping(value="/{id}/{id1}",method=RequestMethod.GET)
	public Student getStudent(@PathVariable("id") int sid,@PathVariable("id1") int sid1)
	{
		System.out.println(sid+"........"+sid1);
		System.out.println("hello");
		//service.saveStudent(student);
		return service.getStudent(sid);
	}								

	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value=HttpStatus.CREATED)
	public void saveStudent(@RequestBody Student student)
	{
		service.saveStudent(student);

	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	@ResponseStatus(value=HttpStatus.ACCEPTED)
	
	public void deleteStudent(@PathVariable("id") int id){
		service.deleteStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	@ResponseStatus(value=HttpStatus.OK)
	public void updateStudent(@RequestBody Student student){
		
		service.updateStudent(student);
	}
}
