package p6.string;

public class StringText {
	public static void main(String args[]){
		String str="sadasdsad";
		int length=str.length();
		
		System.out.println("把字符串分解为1个1个的字母");
		for(int i=0;i<length;i++){
			 //把字符串分解为1个1个的字母
			System.out.print(str.charAt(i) + " "); 
		}
		
		System.out.println();
		String[] strings =str.split("");
		for(int i=0;i<strings.length;i++) {
			System.out.print(strings[i]);
		}
		
		System.out.println();
		//看字符串是否等于asd如果等于输出true不等输出false
		System.out.println(str.startsWith("asd"));  
		String atr=" ad cs ef";
		//使字母变红 且位置是变动的
		System.err.println(atr.trim());
		atr ="abcdefghidasd";
		
		//从第三位到第六位的字母
		System.out.println(atr.substring(3,6));
		//e的位置 这里面是在第4位 
		System.out.println(atr.indexOf('e'));
		
		String s1="suns";
		String s2=new String("suns");
		String s="suns";
		System.out.println(s1==s2); //地址不等所有输出false
		System.out.println(s1==s);//地址不等所有输出false
		System.out.println(s1==s2.intern());
		String s3="sun";
		String s4="s";
		String s5=s3+s4;
		System.out.println(s1==s5);
		System.out.println(s5);
		Integer i1=60;
		Integer i2=60;
		Integer i3=0;
		System.out.println(i1==i2);//有看源码得出  在-128---127内时相等
		System.out.println(i1==(i2+i3));
	}
}
