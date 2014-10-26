package p10.innerclass;

public class OutClassInnerClass {
	private String name;
	
	class InnerClass {
		public void print(){
			System.out.println("我是成员内部类");
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
