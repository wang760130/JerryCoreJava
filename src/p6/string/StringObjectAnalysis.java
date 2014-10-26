package p6.string;

public class StringObjectAnalysis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 创建了两个对象，内容都是"xyz",s是一个引用指向heap（堆/栈）这两个的new对象
		 * "abc"是共享池（pool）中的对象
		 */
		String s = new String("abc");
		
		/**
		 * 没有生成新的对象，从pool里查找有没有为abc的对象存在，
		 * 有则拷贝一份，用s1指向他，没有则创建一个新的对象
		 */
		String s1 = "abc";
		
		/**
		 * 创建一个new的对象("abc"),放在heap里面，由s2指向他
		 */
		String s2 = new String("abc");
		
		System.out.println(s == s1);  //false 永远比较内存地址
		System.out.println(s == s2);  //false 
		System.out.println(s1 == s2); //false
		
		/**
		 * s.internt()首先检查pool中是否有，
		 * 有则返回pool中的对象，而s指向的是heap中的对象
		 */
		System.out.println(s == s.intern());   //falsse
		System.out.println(s1 == s1.intern());  //true
		
		System.out.println(s.intern() == s2.intern()); //true都是返回pool的对象
		
		//如果s.equal(t) = true 时， 必有s.intern == t.intern
		
		String hello = "hello";
		String hel = "hel";
		String lo = "lo";
		/**
		 * +号两边都是字面常量时
		 * 拼接结果如果在pool池中有时，直接返回pool的对象地址，如果没有则返回一个对象
		 */
		System.out.println(hello == "hel" + "lo"); //true
		
		/**
		 * 
		 */
		System.out.println(hello == hel + lo); //false
	}

}
