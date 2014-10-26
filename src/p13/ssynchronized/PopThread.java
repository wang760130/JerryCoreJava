package p13.ssynchronized;

public class PopThread extends Thread {
	MyStack ms ;
	public PopThread (MyStack ms){
		this.ms = ms;
	}
	
	public void run(){
		ms.pop();
		//ms.print();
	}
}
