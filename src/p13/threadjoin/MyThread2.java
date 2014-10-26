package p13.threadjoin;
/**
 * join方法也会导致线程阻塞
 * 特点：如果当前线程中调用了另一个线程的join方法，
 * 当前线程会立即阻塞，直到另外一个线程运行完成。
 * @author JERRY
 *
 */
public class MyThread2 extends Thread {
	public Thread t;
	@Override
	public void run(){
		
		
		for (int i = 1 ; i <= 20 ; i ++){
			System.out.println("线程2  T2 i="+i);
			if(i==10){
				try{
					System.out.println("join start");
					t.join(100);
					System.out.println("join end");
				}catch(Exception e){}
			}
		}
	}
}
