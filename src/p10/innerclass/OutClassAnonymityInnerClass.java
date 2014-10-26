package p10.innerclass;

public class OutClassAnonymityInnerClass {
	public void TestAnonymityInnerClass(){
			new IMyInterface(){
				@Override
				public void m1() {
					System.out.println("this is m1 impl");
					System.out.println("我是匿名内部类");
				}
			}.m1();
	}
}
