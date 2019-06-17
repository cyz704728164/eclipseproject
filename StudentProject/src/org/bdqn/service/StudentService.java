package org.bdqn.service;

import java.util.List;

import org.bdqn.entity.Student;

public interface StudentService {
	
	public List<Student> getAllStudent();

	public boolean deleteStudent(int stuno);

	public boolean addStudent(Student student);

	public boolean updateStudent(Student student);
}
