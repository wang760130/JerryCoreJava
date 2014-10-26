package p13.producerconsumer;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack ms = new Stack();
		Thread consumer = new Consumer(ms);
		Thread producer = new Producer(ms);
		
		consumer.start();
		producer.start();
	}

}
