package p12.exception;

public class ExceptionPass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ExceptionPass ep = new ExceptionPass();
//		ep.m1();
		m1();
	}
	public static void m1(){
		System.out.println("m1---1");
		m2();
		System.out.println("m1---2");
	}
	public static void m2(){
		System.out.println("m2---1");
		throw new NullPointerException();
		//System.out.println("m2---2");
	}
}
