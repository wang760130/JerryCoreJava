package p13.producerconsumer;

public class Consumer extends Thread{
	Stack ms;
	char pu ;
	public Consumer(Stack ms){
		this.ms = ms;
	}
	public void run(){
		for(int i = 0 ; i < 26 ; i ++){
			ms.push((char)('A'+i));
		}
		
	}

}
