package p2.base;

public class VariableTest {
	public static void main(String[] args) {
		//变量及复制
		int a=10;
		double d,m,b;
		b=3.14;
	    m=9.32;
	    d=a+m;
	    byte e=127;
	    short f=20000;
	    int u=074;//8进制 前面要加0
		int r=0xa23;//16进制 前面要加0x
		double c=a-b;//因为计算机在表达小数时会丢失精度所以为6.859999999999999
		float k=2.1f;
		float h=3.54981f;
		float t=h-k;//float  一般不会出现进度丢失所以为1.4981
		double j=3.8e4;
		boolean q=true;
		char w='t';//单个字符  可以存储单个汉字
		char y=65;//代表的是41对于的字符  如它的答案为(  65是为A
		char o='\u0041';//和上面是一样的也等于CHAR Y=41;
		long i=5615L;//long型的数据赋值是后面要加上L可以不分大小写
		String s="sada";//字符串
		
		System.out.println("hellow");
		System.out.println(a);//int a=10;
		System.out.println(c);//double c=a-b;
		System.out.println(m);//double d,m,b;
		System.out.println(d);//double d,m,b;
		System.out.println(w);//char w='t';
		System.out.println(s);//char w='t';
		System.out.println(q);//boolean q=true;
		System.out.println(i);//long i=5615L;
		System.out.println(u);// int u=074;
		System.out.println(r);//int r=0xa23;
		System.out.println(e);//byte e=127;
		System.out.println(f);// short f=20000;
		System.out.println(h);//float h=3.54981f;
		System.out.println(j);//double j=3.8e4;
		System.out.println(k);//float k=2.1f;
		System.out.println(t);//float t=h-k;
		System.out.println(y);//char y=65;
		System.out.println(o);//char o='\u0041';
	}
}
