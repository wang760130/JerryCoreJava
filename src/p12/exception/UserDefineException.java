package p12.exception;


public class UserDefineException {
	public static void main(String[] args) throws ClassNotFoundException {
		try{
			int i = 0;
			System.out.println(10/i);
		} catch (ArithmeticException e) {
			System.out.println("�����쳣");
			e.printStackTrace();
		} finally{
			System.out.println("������ζ�Ҫִ�е�");
		}
	}
}
