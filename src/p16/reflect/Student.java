package p16.reflect;

import java.util.ArrayList;

public class Student extends ArrayList<Object> implements Comparable<Object>{
	
	private static final long serialVersionUID = 1L;
	public String name;
	private int age;
	public String str;
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s = (Student) o;
		if(this.age <s.age) return -1;
		else if(this.age == s.age) return 0;
		else return 1;
	}
	public void study(int time) {
		System.out.println("ѧϰ��"+time+"��Сʱ");
	}
	public void study(int time, double time2) {
		System.out.println("ѧϰ��"+(time+time2)+"��Сʱ");
	}
}
