package p13.ssynchronized;

public class test {
	
	public static void main(String[] args) {
		
//		MyStack stack = new MyStack();
//		stack.push('c');
//		stack.print();
//		stack.pop();
//		stack.print();
		
		MyStack stack2 = new MyStack();
		Thread PushThread = new PushThread(stack2);
		Thread PopThread = new PopThread(stack2);
		
		PushThread.start();
		PopThread.start(); 
		
		
		
		
	}

}
