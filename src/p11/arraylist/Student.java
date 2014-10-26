package p11.arraylist;

public class Student implements Comparable<Object>{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
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
	@Override
	public int compareTo(Object o) {
		Student s=(Student )o;
		 if(this.age<s.age)
			 return -1;
		 else if(this.age==s.age)
			 return 0;
		 else 
			 return 1;
	}
	
	//跟上面等价
//	 public int compareTo(Object o){
//		 Student s=(Student )o;
//		 return this.age-s.age;
//   	 }
	
}
