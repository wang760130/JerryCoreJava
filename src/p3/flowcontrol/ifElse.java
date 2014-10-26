package p3.flowcontrol;

import java.util.Scanner;

public class ifElse {
	public static void main(String args0[]){
		int a=20;

		System.out.println(a);
		Scanner s=new Scanner(System.in);//让你从控制台输入一个数字
		System.out.println("请输入数据：");
		int imp=s.nextInt();//调用你输入的数
		if(imp>0){
			if(imp<59){
				System.out.println("你也太菜了");
			}
			else if(imp<70){
				System.out.println("你运气也太好了:");
			}
			else if(imp<80){
				System.out.println("良好");
	   }
	   else if(imp<90){
		   System.out.println("较好");		   
	   }
	   else if(imp<100){
		   System.out.println("你也太牛B了");		   
	   }
	   else{System.out.println("这不是你是分数");}
	    }
	   else{System.out.println("请正确输入");}
		
	}
}
