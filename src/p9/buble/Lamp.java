package p9.buble;

public class Lamp {
	//通过接口接受
	private IBuble iBuble;
	//安装灯泡的灯口
	public void setBuble(IBuble iBuble) {
		this.iBuble = iBuble;			//this 指向当前对象		
	}
	//开关
	public void on() {
		System.out.println("light");
		iBuble.light();
	}
}
