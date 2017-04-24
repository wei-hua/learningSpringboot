package com.learningSpringBoot.example1;

public class Student {
	private int ID;
	private String Name;
	private int age;

	public Student(){
		
	}
	
	public Student(int iD, String name, int age) {
		super();
		ID = iD;
		Name = name;
		this.age = age;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
