package p13.mystack;

public class PopThread extends Thread {
	MyStack ms ;
	public PopThread (MyStack ms){
		this.ms = ms;
	}
	
	public void run(){
		System.out.print("pop_start ");
		ms.pop();
		System.out.print("pop_end ");
		ms.print();
	}
}
