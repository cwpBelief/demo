package com.dto;
import com.entity.Student;
public class Encapsulation { // SystemAdminDto
	private Integer username_errors; // 定义用户名错误
	private Student student;
	//一键生成对应的getter和setter方法
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getUsername_errors() {
		return username_errors;
	}
	public void setUsername_errors(Integer username_errors) {
		this.username_errors = username_errors;
	}
	
}
