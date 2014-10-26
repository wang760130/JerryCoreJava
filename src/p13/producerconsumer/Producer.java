package p13.producerconsumer;

public class Producer extends Thread {
	Stack ms;
	public Producer (Stack ms){
		this.ms = ms;
	}
	public void run(){
		for(int i = 0 ; i < 26 ; i ++){
			ms.pop();
		}
	}
}
