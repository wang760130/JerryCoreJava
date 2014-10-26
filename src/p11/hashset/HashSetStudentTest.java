package p11.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetStudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("zhao",23);
		Student s2 = new Student("qian",21);
		Student s3 = new Student("sun",23);
		Student s4 = new Student("li",22);
		
		Set<Student> s = new HashSet<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		
		Iterator<Student> ss=s.iterator();
	    while(ss.hasNext()){
	    	Student stu=(Student)ss.next();	    
	    	System.out.print("姓名"+stu.getName()+"   "); 
	    	System.out.println("年龄"+stu.getAge()); 
		}
	    
//	    for(Student stu:s)  {
//	    	System.out.print("姓名"+stu.getName()+"   "); 
//	    	System.out.println("年龄"+stu.getAge()); 
//	    }
	}

}
