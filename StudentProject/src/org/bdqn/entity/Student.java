package org.bdqn.entity;

public class Student {
	private Integer stuno;
	private String stuname;
	private Integer stuage;
	public Student(Integer stuno, String stuname, Integer stuage) {
		super();
		this.stuno = stuno;
		this.stuname = stuname;
		this.stuage = stuage;
	}
	public Student() {
		super();
	}
	public Integer getStuno() {
		return stuno;
	}
	public void setStuno(Integer stuno) {
		this.stuno = stuno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public Integer getStuage() {
		return stuage;
	}
	public void setStuage(Integer stuage) {
		this.stuage = stuage;
	}
	@Override
	public String toString() {
		return "Student [stuno=" + stuno + ", stuname=" + stuname + ", stuage=" + stuage + "]";
	}
	
}
