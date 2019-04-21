package com.meant.schools.schoolcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meant.schools.schooldao.schooldaointerface;
import com.meant.schools.schooldao.servlayer;
import com.meant.schools.schooldao.students;

@RestController
public class schoolcontroller {
	
	@Autowired
	schooldaointerface dao;
	
	@Autowired
	servlayer serv;
	
	@GetMapping("students")
	public List<students> getAllstudents(){
		
		return dao.findAll();
	}
	@GetMapping("student/{id}")
	public void getstudent(@PathVariable("id") int identity){
		
		serv.getstudent(identity);
	}
	
	@PostMapping("student")
	public void addstudent(@RequestBody students student) {
		
		serv.addstudent(student);
	}
	@PutMapping("student/{id}")
	public void updateStudent(@PathVariable("id") int Identity, @RequestBody students s) {
		
		serv.updateStudent(Identity,s);
	}


	@DeleteMapping("student/{id}")
	public void deleteStudent(@PathVariable("id") int Identity) {
	
		serv.deleteStudent(Identity);
}
}