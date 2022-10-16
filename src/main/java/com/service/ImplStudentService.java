package com.service;
import com.dto.Encapsulation;
import com.dao.ImplStudent;
import com.dao.LinkMysl;
import com.entity.Student;
public class ImplStudentService implements StudentService{
	private LinkMysl implstudent = new ImplStudent();
	
	@Override
	public Encapsulation login(String username, String password) {
		//通过username查询数据库
		//查询结果为空；username错误
		//查询结果不为空，再查看password
		Student student = this.implstudent.findByUsername(username);
		Encapsulation Encapsulation_01 = new Encapsulation();
		if(student == null){
		Encapsulation_01.setUsername_errors(-1);
		}else{
			if(!(student.getPassword().equals(password))){
				Encapsulation_01.setUsername_errors(-2);
			}else{
				Encapsulation_01.setUsername_errors(-3);
				Encapsulation_01.setStudent(student);
			}
		}
		return Encapsulation_01;
	}
}
