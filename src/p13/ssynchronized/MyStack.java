package p13.ssynchronized;

public class MyStack {
	char[] data = {'a','b',' '};
	int index = 2; 
	Object lock = new Object();
	
	public void push(char ch){
		synchronized(lock){//���Ը�Ϊthis��ÿһ������ֻ��һ����������
			System.out.print("push-start push:"+ch+"   ");
			data[index] = ch;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			index ++;
			print();
			System.out.println("push-end  ");
		}
	}
	public void pop(){
		synchronized(lock){
			index --;
			System.out.print("pop-start pop:"+data[index]+"  ");
			data[index] = ' ';
			System.out.println("pop-end ");
			print();
		}
	}
	public synchronized void print(){
		for (int i = 0 ; i < data.length ; i ++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
