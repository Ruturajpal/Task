package com.students.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.entity.Students;
import com.students.repository.StudentRepository;

@Service
public class MyServices implements MyServiceImpl{
	
	@Autowired
	private StudentRepository studentRepository;
	
//	List<Students> list;
	
	public MyServices() {
//		list=new ArrayList<Students>();
	//	list.add(new Students());
		
	}
	@Override
	public List<Students> getList() {
		// TODO Auto-generated method stub
		return this.studentRepository.findAll();
	}



	@Override
	public Students getStudent(int id) {
		// TODO Auto-generated method stub
		return this.studentRepository.getOne(id);
	}

	@Override
	public Students updateStudents(Students students) {
		// TODO Auto-generated method stub
		studentRepository.save(students);
		return students;
	}

	@Override
	public void deleteStudents(int parseInteger) {
		// TODO Auto-generated method stub
	Students  entity =	studentRepository.getOne(parseInteger);
	studentRepository.delete(entity);
		return ;
	}
	@Override
	public Students addStudents(Students students) {
		// TODO Auto-generated method stub
		studentRepository.save(students);
		return students;
	} 
	
	

}
