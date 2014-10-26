package p6.stringequal;

public class StringEqual {

	/**
	 * "==" 对象引用是不是指的同一个地方
	 * equals 比较字符串内容是否相同		
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="qwe";
		String s2="qwe";
		String s3=new String("qwe");			//这是定义一个新的函数
		System.out.println(s1==s2); 				//ture
		System.out.println(s1.equals(s2));       //ture
		System.out.println(s1.equals(s3));       //ture
		System.out.println(s1==s3);               //false
		System.out.println(s1.equals(s3));       //ture
		if(s1==s2){
			System.out.println("1");			
		}else{
			System.out.println("2");
		}
		
		if(s1.equals(s2)){
			System.out.println("1");	
		}else{
			System.out.println("2");
		}
		
		if(s1==s3){
			System.out.println("1");	
		}else{
			System.out.println("2");
		}
		
		if(s1.equals(s3)){
			System.out.println("1");	
		}else{
			System.out.println("2");
		}
		
	}
}