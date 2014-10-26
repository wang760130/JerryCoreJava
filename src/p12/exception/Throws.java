package p12.exception;

import java.io.*;

public class Throws {
	public static void main(String[] args)throws Exception {
		System.out.println("main-1");
		m1();
		System.out.println("main-2");
	}
//	public static void m1()throws FileNotFoundException, EOFException{
	public static void m1()throws IOException{
		System.out.println("m1---1");
		m2();
		System.out.println("m1---2");
	}
	public static void m2() throws FileNotFoundException , EOFException {
		System.out.println("m2---1");
		//throw new FileNotFoundException();
		if(true){
			throw new FileNotFoundException();}
		else{
			throw new EOFException();
		}
		//System.out.println("m2---2");
	}
}
