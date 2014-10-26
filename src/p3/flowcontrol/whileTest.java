package p3.flowcontrol;

import java.util.Scanner;

public class whileTest {
	public static void main(String[] args){
		int i=1;
		while(i<5){
			Scanner a=new Scanner(System.in);
			System.out.print("请输如数字：");
			int po=a.nextInt();
			System.out.println("你输入了"+i+"次");
			System.out.println("你输如的数据为："+po);
			//i++;//运行4次
			++i;//也运行4次
		}
	}

}
