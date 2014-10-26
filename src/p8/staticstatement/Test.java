package p8.staticstatement;

public class Test {
	// 普通语句块
	{
		System.out.println("this is super normal");
	}
	// 静态语句块
	static {
		System.out.println("this is super static statement");
	}

	public Test() {
		System.out.println("this is super constructor");
	}

	public static void main(String[] args) {
		SubTestStaticStatement sub = new SubTestStaticStatement();
		sub.toString();
	}
}

class SubTestStaticStatement extends Test {
	{
		System.out.println("this is sub normal");
	}

	public SubTestStaticStatement() {
		System.out.println("this is sub constructor");
	}

	static {
		System.out.println("this is sup static statement");
	}

}
