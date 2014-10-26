package p13.mystack;

public class MyStack {
	char[] data = {'a','b',' '};
	int index = 2; 
	
	public void push(char ch){
		System.out.println("push-start push:"+ch+" ");
		data[index] = ch;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		index ++;
		System.out.println("push-end");
	}
	public void pop(){
		System.out.println("pop-start");
		index --;
		data[index] = ' ';
		System.out.println("pop-end");
	}
	public void print(){
		for (int i = 0 ; i < data.length ; i ++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
