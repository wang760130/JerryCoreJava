package p13.computerthread;

public class Test {
	 
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		// ����������
		Producer producer = new Producer(computer);
		
		// ����������
		Consumer consumer = new Consumer(computer);
		
		// ���������������߳�
		Thread t1 = new Thread(producer);
		t1.setName("������A");
		Thread t2 = new Thread(producer);
		t2.setName("������B");

		// ���������������߳�
		Thread t3 = new Thread(consumer);
		t3.setName("������A");
		Thread t4 = new Thread(consumer);
		t4.setName("������B");
		
		// �����߳�
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}