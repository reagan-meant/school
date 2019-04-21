package com.meant.schools.schooldao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servlayer {
	@Autowired
	schooldaointerface dap;

	public void addstudent(students student) {
		
		dap.save(student);
	}
	public List<students> getAllstudents(){
		
		return dap.findAll();
	}
	public Optional<students> getstudent(int identity){
		
		return dap.findById(identity);
	}
	
	public void updateStudent(int Identity, students s) {
		
		dap.deleteById(Identity);
		dap.save(s);
	}


public void deleteStudent(int Identity) {
	
	dap.deleteById(Identity);
}

}
