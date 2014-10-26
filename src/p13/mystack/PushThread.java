package p13.mystack;

public class PushThread extends Thread {
	MyStack ms ;
	public PushThread (MyStack ms){
		this.ms = ms;
	}
	
	public void run(){
		System.out.print("push_start  ");
		ms.push('c');
		System.out.print("push_end  ");
		ms.print();
	}
}
