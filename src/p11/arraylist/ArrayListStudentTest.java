package p11.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListStudentTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Student s1 = new Student("zhao",20);
		Student s2 = new Student("qian",22);
		Student s3 = new Student("sun",20);
		Student s4 = new Student("li",21);
		Student s5 = new Student("zhou",20);
		Student s6 = new Student("wu",20);
		
		List<Student> l = new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		
		//遍历集合
		System.out.println("for循环遍历");
		for(Student name:l){
			 System.out.print("name:"+name.getName() + "   ");
			 System.out.println("name:"+name.getAge());
  		}
		
//		Collections.sort(l);
		
		//创建对象进行排序
//		ComparatorStudent cs=new ComparatorStudent();
//		Collections.sort(l, cs); 
		
		//利用内部类进行排序
		Collections.sort(l,new Comparator<Student>(){
					public int compare(Student o1, Student o2){
						Integer stu1_age1= Integer.valueOf(o1.getAge());
						Integer stu2_age2= Integer.valueOf(o2.getAge());
						//比较年龄相等
						int flage =stu1_age1.compareTo(stu2_age2);
						//如果年龄相等则比较姓名
						if(flage ==0){
							flage = o1.getName().compareTo(o2.getName());
						}
						return flage;
					}
				}
		);
		
		//遍历集合
		System.out.println("Iterator循环遍历");
		Iterator<Student> i = l.iterator(); 
		while(i.hasNext()){			
		Student s=(Student)i.next();
			System.out.print("name:"+s.getName() + "   ");
			System.out.println("name:"+s.getAge());
		}
	}

}
