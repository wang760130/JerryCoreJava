package p13.threadjoin;

public class MyThread1 extends Thread{
	@Override
	public void run(){
		for (int i = 1 ; i <= 20 ; i ++){
			System.out.println("�߳�1  T1 i="+i);
		}
	}
}
