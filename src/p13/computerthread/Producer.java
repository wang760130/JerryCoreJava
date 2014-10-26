package p13.computerthread;

public class Producer implements Runnable {

	Computer computer;
	
	public Producer(Computer computer) {
		this.computer = computer;
	}
	
	public void run() {
		while(true){
			this.computer.put("acer");
		}
	}
	 
}
