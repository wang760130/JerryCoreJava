package p12.exception;

public class TestClassCastException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Integer(10);
		String s = (String)o;
		System.out.println(s);
	}

}
