package p10.innerclass;


public class OutClassStaticInnerClass {
	private String name;
	
	static class InnerClass {
		public void print(){
			System.out.println("我是静态内部类");
		}
	}
	public void getInnerClass(){
		InnerClass ic = new InnerClass();
		ic.print();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
