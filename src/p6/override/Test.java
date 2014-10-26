package p6.override;

public class Test {

	public static void main(String[] args) {
		Super sup = new Super();
		sup.funtion();  	// This is sup function
		
		Sub sub = new Sub();
		sub.funtion();  // This is sub function
		
		Super sup2 = new Sub();
		sup2.funtion();  	//This is sub function
	}

}

class Super {
	public void funtion () {
		System.out.println("This is Super function");
	}
}

class Sub extends Super{
	/**
	 * 子类覆盖的修饰符范围必须是大于或等于父类对应方法的修饰符范围
	 * 子类覆盖的返回值必须域父类的返回值一致
	 * 覆盖的方法的产生必须和父类方法一致
	 */
	@Override
	public void funtion() {
		System.out.println("This is sub function");
		super.funtion();
	}
	
}