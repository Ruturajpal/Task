package com.students.services;

import java.util.List;

import com.students.entity.Students;

public interface MyServiceImpl {

	List<Students> getList();

	Students addStudents(Students students);

	Students getStudent(int parseInt);


	void deleteStudents(int parseInt);

	Students updateStudents(Students students);


	
}
