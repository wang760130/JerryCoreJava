package p4.funtion;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("请输入行好：");
		int qw = a.nextInt();
		for (int i = 1; i <= qw; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = 1; i <= qw; i++) {
			for (int j = qw; j >= i; j--) {
				System.out.print(" ");// 空格与星号不重叠所以只要空出空格在确定星号有几个就能形成三角形
			}
			for (int h = 1; h <= i * 2 - 1; h++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
