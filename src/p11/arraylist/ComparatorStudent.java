package p11.arraylist;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student stu1 =(Student)o1;
		Student stu2 =(Student)o2;
		Integer stu1_age1= Integer.valueOf(stu1.getAge());
		Integer stu2_age2= Integer.valueOf(stu2.getAge());
		//比较年龄相等
		int flage =stu1_age1.compareTo(stu2_age2);
		//如果年龄相等则比较姓名
		if(flage ==0){
			flage = stu1.getName().compareTo(stu2.getName());
		}
		return flage;
	}
	
}
