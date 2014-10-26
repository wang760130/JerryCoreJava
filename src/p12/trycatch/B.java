/**
 * 文件名称 : B.java 
 * 项 目 名 : CoreJava
 * 包   名 : p12.trycatch  
 * 版权所有 : 版权所有(C)2012-2013
 * 创建作者 : Jerry Wang
 * 电子邮件 : jerry002@126.com
 * 创建时间 : 2013-9-24 下午5:10:22
 * 当前版本 : v1.0 
 */
package p12.trycatch;

/**
 * @ClassName: B
 * @Description: TODO
 * @Author Jerry Wang
 * @Date 2013-9-24 下午5:10:22
 */
public class B {

	public void method() {
		try {
			C c = new C();
			c.method();
			System.out.println("B -- try catch");
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("B -- exception");
		} finally {
			System.out.println("B -- finally");
		}
 	}
}
