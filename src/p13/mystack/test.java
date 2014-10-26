package p13.mystack;

public class test {
	
	public static void main(String[] args) {
		
//		MyStack stack = new MyStack();
//		stack.push('c');
//		stack.print();
//		stack.pop();
//		stack.print();//按顺序执行，但没有用到线程
		
		MyStack stack2 = new MyStack();
		Thread PushThread = new PushThread(stack2);
		Thread PopThread = new PopThread(stack2);
		
		PushThread.start();
		PopThread.start(); //线程不安全
		
		
	}

}
