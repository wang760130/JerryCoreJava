package p2.base;

public class EscapeSequenceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("hellow");
		System.out.print("\n");//表示换行
		System.out.print("hellow");
		System.out.print("\t");//表示空格
		System.out.print("hellow");
		System.out.print("\\");//表示能输出特殊意义的关键字
		System.out.print("\n");
		System.out.print("\\n");
		System.out.print("hellow");
		System.out.print("\r");//也表示换行
		System.out.print("hellow");
	}

}
