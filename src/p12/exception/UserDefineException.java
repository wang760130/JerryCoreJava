package p12.exception;


public class UserDefineException {
	public static void main(String[] args) throws ClassNotFoundException {
		try{
			int i = 0;
			System.out.println(10/i);
		} catch (ArithmeticException e) {
			System.out.println("出现异常");
			e.printStackTrace();
		} finally{
			System.out.println("无论如何都要执行的");
		}
	}
}
