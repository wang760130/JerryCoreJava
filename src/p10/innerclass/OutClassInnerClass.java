package p10.innerclass;

public class OutClassInnerClass {
	private String name;
	
	class InnerClass {
		public void print(){
			System.out.println("���ǳ�Ա�ڲ���");
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
