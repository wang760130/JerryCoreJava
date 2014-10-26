package p13.threadjoin;

public class Test {
	public static void main(String[] args){
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		
		((MyThread2)t2).t = t1;
		
		t1.start();
		t2.start();
		
	}
}
