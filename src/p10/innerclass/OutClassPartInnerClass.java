package p10.innerclass;

public class OutClassPartInnerClass {
	private int value1= 1 ;
	private static int value2 = 2 ;
	public void TestPartInnerClass(){
		final int i = 10;//必须声明成final，且赋初值
		class MyInnerClass {
			public void testInner(){
			System.out.println("局部内部类可以访问外部类的成员变量  "+value1);
			System.out.println("局部内部类可以访问外部类的静态成员变量  "+value2);
			System.out.println("局部内部类访问的局部变量必须要final修饰 "+i);
			System.out.println("我是局部内部类");
			}
		}
		MyInnerClass mic = new MyInnerClass();
		mic.testInner();
	}
/*
 * 将函数的参数引用设为final，主要是考虑到局部变量的生命周期与局部内部类的对象的生命周期的不一致性!
 * 往深层次说，就是为了解决参数的不一致性问题。即 因为从编程人员的角度来看他们是同一个东西， 
 * 如果编程人员在程序设计的时候在内部类中改掉参数的值，但是外部调用的时候又发现值其实没有被改掉，
 * 这就让人非常的难以理解 和接受，为了避免这种尴尬的问 题存在，所以编译器设计人员把内部类能够使用的参数设定为必须是final来规避这种莫名其妙错误的存在。
 * 举个例子来说可能会更清楚一些，对于局部变量int i=3;方法中代码修改的是这个真正的变量i,
 * 而内部为对象修改的是i的复制品copy_i，这样这两个i就会发生值的不一致性，（这一点正是这个实现技术的缺陷),
 * 所以干脆就不允许这个int i=3;局部变量发生值的改变!由于不允许改int i的值,所以这两个int i的值就始终保持值的一致了,
 * 这才是final的这个规定的由来! 是一种不得不如此的无奈之举!
 * 简单的来说，因为生命周期的原因，内部类需要复制局部变量为内部类的一个属性变量，因为复制，所以要将修饰符设为final。
 */
}