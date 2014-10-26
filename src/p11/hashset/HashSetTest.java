package p11.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		String s1 = new String("zhao");
		String s2 = new String("qian");
		String s3 = new String("sun");
		String s4 = new String("li");
		String s5 = new String("qian");
		
		Set<String> s = new HashSet<String>();
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		
		Iterator<String> ss=s.iterator();
		while(ss.hasNext()){  
			System.out.println(ss.next());	
		}
		
	}

}
