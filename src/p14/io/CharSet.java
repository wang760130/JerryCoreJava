package p14.io;

import java.io.UnsupportedEncodingException;

public class CharSet {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		String oname = "测试";
		byte[] bs = oname.getBytes("gbk");
		String dname = new String(bs,"GBK");
		System.out.println(dname);//测试

		String oname2 = "测试";
		byte[] bs2 = oname2.getBytes("gbk");
		String dname2 = new String(bs2,"utf-8");
		System.out.println(dname2);//????
	}

}
