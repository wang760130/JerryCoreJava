package p6.stringappend;

public class Test {

	public static void main(String aegs[]){
//		String a="sun";
//		String b="sunqw"; 
//		String c=new String("sadsa");//
//		System.out.println();
		
		//StringBuffer定义的字符有线程安全，是同步的  但效率有些低  调用是有序的
		StringBuffer sbuffer =new StringBuffer("abc");
		sbuffer.append("def").append("gh");//字符串的连接
		System.out.println(sbuffer);
		System.out.println(sbuffer.toString());
		
		//定义的字符 不是同步的 效率比较高
		StringBuilder sBuffer2=new StringBuilder("abcdefgh");
		sBuffer2.append("def").append("gh");//字符串的连接
		System.out.println(sBuffer2.toString());
		
		
		// String 初始化不能赋值为null
		String s = null;
		s = s + "s";  //s = (new StringBuilder(String.valueOf(s))).append("s").toString();
		System.out.println(s);    // nulls
		
		
	}
}
