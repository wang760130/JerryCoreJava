package p13.threadjoin;
/**
 * join����Ҳ�ᵼ���߳�����
 * �ص㣺�����ǰ�߳��е�������һ���̵߳�join������
 * ��ǰ�̻߳�����������ֱ������һ���߳�������ɡ�
 * @author JERRY
 *
 */
public class MyThread2 extends Thread {
	public Thread t;
	@Override
	public void run(){
		
		
		for (int i = 1 ; i <= 20 ; i ++){
			System.out.println("�߳�2  T2 i="+i);
			if(i==10){
				try{
					System.out.println("join start");
					t.join(100);
					System.out.println("join end");
				}catch(Exception e){}
			}
		}
	}
}
