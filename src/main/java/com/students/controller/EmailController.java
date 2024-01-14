package com.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.entity.Students;
import com.students.services.MyServiceImpl;

@RestController
@RequestMapping("/mapping")
public class EmailController {

	@Autowired
	private MyServiceImpl myServicesImpl;
	
	@GetMapping("/students")
	public List<Students> getList(){
		return myServicesImpl.getList();
	}
	
	@PostMapping("/students/")
	public Students addList(@RequestBody Students students) {
		return this.myServicesImpl.addStudents(students);
		
	}
	 
	@GetMapping("/students/{studentid}")
	public Students getStudents(@PathVariable String id) {
		return this.myServicesImpl.getStudent(Integer.parseInt(id));
	}
	
	@PutMapping("/update")
	public Students updateStudents(@RequestBody Students students) {
		return this.myServicesImpl.updateStudents(students);
	}
	
	@DeleteMapping("students/{id}")
	public ResponseEntity<HttpStatus> deleteStudents(@PathVariable String id){
		try {
			this.myServicesImpl.deleteStudents(Integer.parseInt(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

		
	}

