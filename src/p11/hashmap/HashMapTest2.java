package p11.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapTest2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("zhao", 22);
		m.put("qian", 21);
		m.put("sun", 20);
		m.put("li", 22);
		
		// JDK1.4中   遍历方法一  hashmap entrySet() 遍历 
		System.out.println("JDK1.4中   遍历方法一  hashmap entrySet() 遍历 ");
		Iterator<Entry<String, Integer>> it = m.entrySet().iterator(); 
		while (it.hasNext()) { 
			Map.Entry entry = it.next(); 
			Object key = entry.getKey(); 
			Object value = entry.getValue(); 
			System.out.println("key=" + key + " value=" + value); 
		} 
		
		// JDK1.5中,应用新特性For-Each循环 
		System.out.println("JDK1.5中,应用新特性For-Each循环 ");
		for (Map.Entry<String, Integer> entry : m.entrySet()) { 
			String key = entry.getKey().toString(); 
			String value = entry.getValue().toString(); 
			System.out.println("key=" + key + " value=" + value); 
		}
		
		// 遍历方法三 hashmap keySet() 遍历
		System.out.println("遍历方法三 hashmap keySet() 遍历");
		for (Iterator i = m.keySet().iterator(); i.hasNext();) { 
			Object obj = i.next(); 
			System.out.println(obj);// 循环输出key 
			System.out.println("key=" + obj + " value=" + m.get(obj)); 
		} 
		for (Iterator i = m.values().iterator(); i.hasNext();) { 
			Object obj = i.next(); 
			System.out.println(obj);// 循环输出value 
		} 
		
		// 遍历方法四 treemap keySet()遍历
		System.out.println("遍历方法四 treemap keySet()遍历");
		for (Object o : m.keySet()) { 
			System.out.println("key=" + o + " value=" + m.get(o)); 
		} 
		
		// java如何遍历Map <String, ArrayList> map = new HashMap<String, ArrayList>(); 
		System.out.println("java  遍历Map <String, ArrayList> map = new HashMap <String, ArrayList>();"); 
		Map<String, ArrayList> map = new HashMap<String, ArrayList>(); 
		Set<String> keys = map.keySet(); 
		Iterator<String> iterator = keys.iterator(); 
		while (iterator.hasNext()) { 
			String key = iterator.next(); 
			ArrayList arrayList = map.get(key); 
			for (Object o : arrayList) { 
				System.out.println(o + "遍历过程"); 
			} 
		} 
		Map<String, List> mapList = new HashMap<String, List>(); 
		for (Map.Entry entry : mapList.entrySet()) { 
			String key = entry.getKey().toString(); 
			List<String> values = (List) entry.getValue(); 
			for (String value : values) { 
				System.out.println(key + " --> " + value); 
			} 
		} 
	}

}
