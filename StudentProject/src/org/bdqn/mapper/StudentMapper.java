package org.bdqn.mapper;

import java.util.List;

import org.bdqn.entity.Student;

public interface StudentMapper {

	List<Student> getAllStudent();

	boolean deleteStudent(int stuno);

	boolean addStudent(Student student);

	boolean updateStudent(Student student);


}
