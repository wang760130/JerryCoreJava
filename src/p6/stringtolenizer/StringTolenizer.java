package p6.stringtolenizer;

import java.util.StringTokenizer;

public class StringTolenizer {
	public static void main(String args[]) {
		String s = "I am james, she is my girlfriend";
		StringTokenizer fenxi = new StringTokenizer(s," ,");
		int num = fenxi.countTokens();
		while(fenxi.hasMoreTokens()) {
			String str = fenxi.nextToken();
			System.out.println(str);
			System.out.println("还剩" + fenxi.countTokens() + "个单词");
		}
		System.out.println("s共有单词：" +num + "个");
	}
}
