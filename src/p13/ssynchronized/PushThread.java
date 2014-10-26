package p13.ssynchronized;

public class PushThread extends Thread {
	MyStack ms ;
	public PushThread (MyStack ms){
		this.ms = ms;
	}
	
	public void run(){
		ms.push('c');
		//ms.print();
	}
}
