package p3.flowcontrol;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args){
		int i=1;
		do{
		Scanner a=new Scanner(System.in);
		System.out.println("请输入数字");
		
		int qw=a.nextInt();
		System.out.println("输入了"+i+"次");
		System.out.println("你输如的数据为："+qw);
		//int i=1; 这个i应该在外面定义才能用
		//i++;//输入了4次
		++i;//输入了4次
		}while(i<5);
	}
}
