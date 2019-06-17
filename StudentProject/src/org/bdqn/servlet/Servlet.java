package org.bdqn.servlet;

import java.util.HashMap;
import java.util.List;

import org.bdqn.entity.Student;
import org.bdqn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.org.glassfish.external.probe.provider.annotations.ProbeParam;

@Controller
@RequestMapping("controller")
public class Servlet {
	
	@Autowired
	@Qualifier("studentService")
	private StudentService ss;

	public void setSs(StudentService ss) {
		this.ss = ss;
	}

	@RequestMapping("/getAllStudent")
	public String getAllStudent(HashMap<String,Object> map) {
		List<Student> student = ss.getAllStudent();
		map.put("student", student);
		return "index";
	}
	
	
	@RequestMapping("deleteStudent/{stuno}")
	public String deleteStudent(@PathVariable("stuno") int stuno) {
		if(ss.deleteStudent(stuno)) {
			return "redirect:/controller/getAllStudent";
		}
		return "null";
	}
	
	@RequestMapping("addStudent")
	public String deleteStudent(Student student) {
		if(ss.addStudent(student)) {
			return "redirect:/controller/getAllStudent";
		}
		return "null";
	}
	
	@RequestMapping("updateStudent")
	public String updateStudent(Student student) {
		if(ss.updateStudent(student)) {
			return "redirect:/controller/getAllStudent";
		}
		return "null";
	}
	
	
	
	
	
	
	
	
	
	
	
}
