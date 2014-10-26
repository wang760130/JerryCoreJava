package p13.createthread;

public class ImplementsRunnable implements Runnable{

	@Override
	public void run(){
		for (int i = 1 ; i <= 2000000 ; i ++){
			System.out.println("线程2  i="+i+"  T2");
		}
		try{
			Thread.sleep(200);
		}
		catch(InterruptedException e){}
	}

}
