package p13.computerthread;

public class Computer {
	// ��ʾ�ֿ��п����
	private int number = 10;
	
	// ���ֿ����ŵ���
	public synchronized void put(String name){
		if(number >= 10){
			try{
				this.wait();
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"����ŵȴ�---�ֿ����㹻");
			return;
		}
		number+=1;
		System.out.println(Thread.currentThread().getName()+"�����һ̨"+name+"����,Ŀǰ����������Ϊ:"+number);
		// �������еȴ����߳�(�߳���ִ��wait()�����󣬻��ͷŶ���ͬ����)
		notifyAll();
	}
	
	// ��ֿ���ȡ������
	public synchronized void get(String name) {
		if(number <= 0){
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+": ȡ��������-��Ϊ�������Ϊ0");
			return;
		}
		number-=1;
		System.out.println(Thread.currentThread().getName()+"ȡ����һ̨"+name+"����,Ŀǰ��������Ϊ:"+number);
		notifyAll();
	}
}
