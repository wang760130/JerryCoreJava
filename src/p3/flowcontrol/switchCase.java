package p3.flowcontrol;

import java.util.Scanner;

public class switchCase {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("请输入数据：");
		int oi=s.nextInt();
		switch(oi/10){
		case 9:System.out.println("你的分数为优秀");break;
		case 8:System.out.println("你的分数为良好");break;
		case 7:System.out.println("你的分数为及格");break;
		case 6:System.out.println("你的分数为及格");break;
		case 5:;
		case 4:;
		case 3:;
		case 2:;
		case 1:System.out.println("你的分数为不及格");break;
		default:System.out.println("你输入的不是分数");break;		
		}
	}
}
