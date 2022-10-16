package com.dao;
import com.entity.Student;
public interface LinkMysl { // SystemAdminDao
	public Student findByUsername(String username);
	
}
