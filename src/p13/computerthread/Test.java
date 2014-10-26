package p13.computerthread;

public class Test {
	 
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		// 构造生产者
		Producer producer = new Producer(computer);
		
		// 构造消费者
		Consumer consumer = new Consumer(computer);
		
		// 创建生产者两个线程
		Thread t1 = new Thread(producer);
		t1.setName("生产者A");
		Thread t2 = new Thread(producer);
		t2.setName("生产者B");

		// 创建消费者两个线程
		Thread t3 = new Thread(consumer);
		t3.setName("消费者A");
		Thread t4 = new Thread(consumer);
		t4.setName("消费者B");
		
		// 启动线程
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}