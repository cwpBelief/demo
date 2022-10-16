package com.entity;
public class Student {
	//创建实体类，对应的学生
	private String id ;
	private String  username;
	private String  password;
	private String  telephone;
	private String  type;
	//以下是一键生成getter和setter方法,和一键生成的构造方法
	//mvc架构
	public Student(String id, String username, String password, String telephone, String type) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.telephone = telephone;
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
