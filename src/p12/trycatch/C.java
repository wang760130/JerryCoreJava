/**
 * 文件名称 : C.java 
 * 项 目 名 : CoreJava
 * 包   名 : p12.trycatch  
 * 版权所有 : 版权所有(C)2012-2013
 * 创建作者 : Jerry Wang
 * 电子邮件 : jerry002@126.com
 * 创建时间 : 2013-9-24 下午5:11:30
 * 当前版本 : v1.0 
 */
package p12.trycatch;

/**
 * @ClassName: C
 * @Description: TODO
 * @Author Jerry Wang
 * @Date 2013-9-24 下午5:11:30
 */
public class C {
	public void method() {
		try {
			System.out.println("C -- try catch");
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("C -- exception");
		} finally {
			System.out.println("C -- finally");
		}
	}
}
