package p11.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("zhao", 22);
		m.put("qian", 21);
		m.put("sun", 20);
		m.put("li", 22);
		
		System.out.println("----------get输出------------");
		System.out.println(m.get("zhao"));
		System.out.println(m.get("qian"));
		System.out.println(m.get("sun"));
		System.out.println(m.get("li"));
		
		System.out.println("---------值的遍历------------");
		Collection<Integer> c =m.values();
		Iterator<Integer> i= c.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		System.out.println("---------键的遍历----------");
		Set<String> s=m.keySet();
		Iterator<String> ii= s.iterator();
		while(ii.hasNext()){
			System.out.println(ii.next());
		}
		
		System.out.println("----------键值的遍历--------");
		Set<String> o=m.keySet();
		Iterator<String> iii= o.iterator();
		while(iii.hasNext()){
			Object key =iii.next();
			System.out.println(key+"="+m.get(key));
		}
		
		System.out.println("----------键值的遍历2----------");
		Collection<Integer> l=m.values();
		Set<String> e=m.keySet();
		Iterator<Integer> iiii= l.iterator();
		Iterator<String> iiiii= e.iterator();
		while(iiii.hasNext()){
			Object key =iiii.next();
			Object key1 =iiiii.next();
			System.out.println(key1+"="+key);
		}
		
		
	}
}
