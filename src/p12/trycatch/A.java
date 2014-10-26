/**
 * 文件名称 : A.java 
 * 项 目 名 : CoreJava
 * 包   名 : p12.trycatch  
 * 版权所有 : 版权所有(C)2012-2013
 * 创建作者 : Jerry Wang
 * 电子邮件 : jerry002@126.com
 * 创建时间 : 2013-9-24 下午5:08:50
 * 当前版本 : v1.0 
 */
package p12.trycatch;

/**
 * @ClassName: A
 * @Description: TODO
 * @Author Jerry Wang
 * @Date 2013-9-24 下午5:08:50
 */
public class A {
	
	public void method() {
		try {
			B b = new B();
			b.method();
			System.out.println("A -- try catch");	
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("A -- exception");
		} finally {
			System.out.println("A -- finally");
		}
	}
}
