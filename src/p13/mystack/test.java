package p13.mystack;

public class test {
	
	public static void main(String[] args) {
		
//		MyStack stack = new MyStack();
//		stack.push('c');
//		stack.print();
//		stack.pop();
//		stack.print();//��˳��ִ�У���û���õ��߳�
		
		MyStack stack2 = new MyStack();
		Thread PushThread = new PushThread(stack2);
		Thread PopThread = new PopThread(stack2);
		
		PushThread.start();
		PopThread.start(); //�̲߳���ȫ
		
		
	}

}
