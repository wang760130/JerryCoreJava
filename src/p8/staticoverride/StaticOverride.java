package p8.staticoverride;

public class StaticOverride {
	public static void main(String[] args) {
		//静态方法不用实例化可以直接类名调用
		Sub1.m();
		Super.m();
	}
}
class Super{
	public static void m(){ 
		System.out.println("this is super");
	}
}
class Sub1 extends Super{
	public static void m(){ 
		System.out.println("this is sub");
	}
}