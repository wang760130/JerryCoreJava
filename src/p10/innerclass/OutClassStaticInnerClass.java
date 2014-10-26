package p10.innerclass;


public class OutClassStaticInnerClass {
	private String name;
	
	static class InnerClass {
		public void print(){
			System.out.println("���Ǿ�̬�ڲ���");
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
