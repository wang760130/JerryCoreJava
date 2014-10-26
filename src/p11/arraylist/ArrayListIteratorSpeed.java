/**
 * 文件名称 : ArrayListIteratorSpeed.java 
 * 项 目 名 : CoreJava
 * 包   名 : p11.arraylist  
 * 版权所有 : 版权所有(C)2012-2013
 * 创建作者 : Jerry Wang
 * 电子邮件 : jerry002@126.com
 * 创建时间 : May 13, 2013 11:11:28 AM
 * 当前版本 : v1.0 
 */
package p11.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: ArrayListIteratorSpeed
 * @Description: TODO
 * @Author Jerry Wang
 * @Date May 13, 2013 11:11:28 AM
 */
public class ArrayListIteratorSpeed {
	public static void main(String args[]) {
		List<Long> lists = new ArrayList<Long>();

		for (Long i = 0l; i < 1000000l; i++) {
			lists.add(i);
		}

		Long oneOk = oneMethod(lists);
		Long twoOk = twoMethod(lists);
		Long threeOk = threeMethod(lists);
		Long fourOk = fourMethod(lists);

		System.out.println("One:" + oneOk);
		System.out.println("Two:" + twoOk);
		System.out.println("Three:" + threeOk);
		System.out.println("four:" + fourOk);

	}

	public static Long oneMethod(List<Long> lists) {

		Long timeStart = System.currentTimeMillis();
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
		Long timeStop = System.currentTimeMillis();

		return timeStop - timeStart;
	}

	public static Long twoMethod(List<Long> lists) {

		Long timeStart = System.currentTimeMillis();
		for (Long string : lists) {
			System.out.println(string);
		}
		Long timeStop = System.currentTimeMillis();

		return timeStop - timeStart;
	}

	public static Long threeMethod(List<Long> lists) {

		Long timeStart = System.currentTimeMillis();
		Iterator<Long> it = lists.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Long timeStop = System.currentTimeMillis();

		return timeStop - timeStart;
	}

	public static Long fourMethod(List<Long> lists) {

		Long timeStart = System.currentTimeMillis();
		for (Iterator<Long> i = lists.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
		Long timeStop = System.currentTimeMillis();

		return timeStop - timeStart;
	}
}
