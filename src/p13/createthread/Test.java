package p13.createthread;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new ExtendsThread();
		
		Runnable target = new ImplementsRunnable();
		Thread t2 = new Thread(target);
		
		//启动线程
		t1.start();
		t2.start();
		
		
//		Thread t3 = new ExtendsAndImplement();
//		t3.start();
		
		Runnable target2 = new ExtendsAndImplement();
		Thread t3 = new Thread(target2);
		t3.start();
	}

}
