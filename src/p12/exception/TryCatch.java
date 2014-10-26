package p12.exception;

import java.io.*;

public class TryCatch {
	public static void main(String[] args) {
		System.out.println("main-1");
		m1();
		System.out.println("main-2");
	}
	public static void m1(){
		System.out.println("m1---1");
		m2();
		System.out.println("m1---2");
	}
	public static void m2(){
		System.out.println("m2---1");
		try{
			throw new FileNotFoundException("Exception---test");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
		 System.out.println("m2---2");
		}
	}
}
