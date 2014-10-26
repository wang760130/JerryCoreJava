package p14.io;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public Student(){}
	public Student(String name , int age){
		this.name = name;
		this.age = age;
	}
	public void setInfo(String name , int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public void showInfo(){
		System.out.println("name:"+this.name+" age:"+age);
	}
	
}
