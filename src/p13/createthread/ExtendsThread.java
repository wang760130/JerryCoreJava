package p13.createthread;
/**
 * 继承Thread类创建线程
 * @author JERRY
 *
 */
public class ExtendsThread extends Thread{
	@Override
	public void run(){
		for (int i = 1 ; i <= 2000000 ; i ++){
			System.out.println("线程1  i="+i+"  T1");
		}
		try{
			Thread.sleep(400);
		}
		catch(InterruptedException e){}
	}
}
