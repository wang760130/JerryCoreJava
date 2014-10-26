package p9.buble;

public class Test {
	public static void main(String[] args) {
		IRedBuble irb = new IRedBuble();
		IGreenBuble igb = new IGreenBuble();
		Lamp i = new Lamp();
		
		i.setBuble(irb);
		i.on();
		i.setBuble(igb);
		i.on();
	}
}
