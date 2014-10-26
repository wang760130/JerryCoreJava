package p13.createthread;

public class ExtendsAndImplement extends Thread implements Runnable{

	@Override
	public void run() {
		for (int i = 1 ; i <= 2000000 ; i ++){
			System.out.println("线程3  i="+i+"  T3");
		}
	}
	
}
