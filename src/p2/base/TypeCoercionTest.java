package p2.base;

public class TypeCoercionTest {

	public static void main(String[] args) {
		int b=10;
		byte c=(byte)b;//强制类型转换
		int a=20;
		int f=a+b;
		byte d=(byte)128;//强制类型转换  使精度丢失
		int p=5;
		p+=1;//p必须赋值不然就出错
		char q='A';
		char e=12;
		char r=(char)(q+e);//字符的类型转换  因为在后面的1还没有转换类型所以要用括号括起来
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		System.out.println(q);
		System.out.println(e);
		System.out.println(r);
	}

}
