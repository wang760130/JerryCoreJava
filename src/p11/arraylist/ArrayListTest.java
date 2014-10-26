package p11.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		String s1 = new String("zhao");
		String s2 = new String("qian");
		String s3 = new String("sun");
		String s4 = new String("li");
		List<String> l = new ArrayList<String>();
		
		//将指定的元素添加到此列表的尾部
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		// 将指定的元素插入此列表中的指定位置
		l.add(0, s4);
		
		//从一号开始  表示减少一个序号
		l.remove(2);
		
		//清空
//		l.clear();
		
		//集合计算长度用方法.size()
		System.out.println(l.size());  
		
		// 判断是否在
		System.out.println(l.contains(s3));
		
		//返回此列表中指定位置上的元素
		System.out.println(l.get(0)); 
		System.out.println(l.get(1));
		
		//判断是否为空
		System.out.println(l.isEmpty());
		
		//返回此列表中最后一次出现的指定元素的索引，或如果此列表不包含索引，则返回 -1
		System.out.println(l.lastIndexOf("sun"));
		
		//遍历集合方法一
		Iterator<String> i = l.iterator();
		System.out.println("Iterator遍历结果");
		while(i.hasNext()){
			System.out.println(i.next()); 		
		}

		Collections.sort(l);//排序
		
		//遍历集合方法二
		System.out.println("for循环遍历结果");
		for(String ll:l) {
			System.out.println(ll);
		}
	}

}
