package p13.computerthread;

public class Computer {
	// 表示仓库中库存数
	private int number = 10;
	
	// 往仓库里存放电脑
	public synchronized void put(String name){
		if(number >= 10){
			try{
				this.wait();
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"：存放等待---仓库库存足够");
			return;
		}
		number+=1;
		System.out.println(Thread.currentThread().getName()+"存放了一台"+name+"电脑,目前库存电脑总数为:"+number);
		// 唤醒所有等待的线程(线程在执行wait()方法后，会释放对象同步锁)
		notifyAll();
	}
	
	// 向仓库里取出电脑
	public synchronized void get(String name) {
		if(number <= 0){
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+": 取电脑受阻-因为库存余数为0");
			return;
		}
		number-=1;
		System.out.println(Thread.currentThread().getName()+"取出了一台"+name+"电脑,目前电脑总数为:"+number);
		notifyAll();
	}
}
