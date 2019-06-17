package org.bdqn.service.impl;

import java.util.List;

import org.bdqn.entity.Student;
import org.bdqn.mapper.StudentMapper;
import org.bdqn.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentMapper sm;
	
		
	public void setSm(StudentMapper sm) {
		this.sm = sm;
	}


	@Override
	public List<Student> getAllStudent() {
		return sm.getAllStudent();
	}


	@Override
	public boolean deleteStudent(int stuno) {
		return sm.deleteStudent(stuno);
	}


	@Override
	public boolean addStudent(Student student) {
		return sm.addStudent(student);
	}


	@Override
	public boolean updateStudent(Student student) {
		return sm.updateStudent(student);
	}

}
