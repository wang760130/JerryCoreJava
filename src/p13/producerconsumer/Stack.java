package p13.producerconsumer;

public class Stack {
	private char[] data = new char[10];
	private int  index = 0 ;
	
	public synchronized void push(char c){
		if(isFull()){
			System.out.println("stack is full  cant push");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		data[index] = c;
		index++;
		System.out.print("puch:"+c+"---");
		print();
		this.notifyAll();
	}
	
	public synchronized void pop(){
		if(isEmpty()){
			System.out.println("stack is empty  cant pop");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		index --;
		char c = data[index];
		data[index] = ' ';
		System.out.print("pop£º"+c+"---");
		print();
		this.notifyAll();
	}
	
	public synchronized boolean isEmpty(){
		if(index <= 0)
			return true;
		else return false;
	}
	
	public synchronized boolean isFull(){
		if(index >= data.length)
			return true;
		else return false;
	}
	
	public synchronized void print(){
		for(int i = 0 ; i < index ; i ++){
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}
