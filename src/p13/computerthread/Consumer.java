package p13.computerthread;

public class Consumer implements Runnable {

	Computer computer;
	
	public Consumer(Computer computer) {
		this.computer = computer;
	}
	
	public void run() {
		while(true){
			computer.get("acer");
		}
	}
}
