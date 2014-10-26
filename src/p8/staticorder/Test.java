package p8.staticorder;

public class Test {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.fncom();
//		sub.fn();
		System.out.println();
		Sub sub2 = new Sub();
		sub2.fncom();
	}
}

class Super {
	public Super() {
		System.out.println("This is super constroctor function");
	}

	static {
		System.out.println("This is super static statement");
	}

	{
		System.out.println("This is super common statement");
	}

	static void fn() {
		System.out.println("This is super static  function");
	}
	
	void fncom() {
		System.out.println("This is super common function");
	}
}

class Sub extends Super {
	public Sub() {
		System.out.println("This is sub constroctor function");
	}

	static {
		System.out.println("This is sub static statement");
	}

	{
		System.out.println("This is sub common statement");
	}

	static void fn() {
		System.out.println("This is sub static function");
	}
	
	void fncom() {
		System.out.println("This is sub common function");
	}
}