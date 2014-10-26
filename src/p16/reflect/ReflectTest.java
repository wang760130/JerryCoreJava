package p16.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class ReflectTest {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws NoSuchFieldException 
	 * @throws SecurityException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws InstantiationException 
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		//获取类对象的三种方式
		
		//类名.class
//		Class<Student> c = Student.class;
		
		//getClass()方法
//		Student student = new Student();
//		Class c = student.getClass();
 		
		//	Class.forName()方法
		//public static Class forName(String className) throws ClassNotFoundException		
		Class<?> c = Class.forName("p16.reflect.Student");
		
		//获得类的名称，包括类名
		String className = c.getName();
		System.out.println("类名： " + className);
		
		//获得类的名称，不包括包名
		String simpleName = c.getSimpleName();
		System.out.println("简单类名： " + simpleName);
		
		//获得本类的父类的类对象
		Class<?> superClass = c.getSuperclass();
		System.out.println("父类：" + superClass);
		
		//获得本类所实现的所有接口的类对象
		Class[] interfaces = c.getInterfaces();
		System.out.println("接口有：");
		for(int i = 0; i < interfaces.length; i++) {
			System.out.println(interfaces[i].getName());
		}
		
		//获得所有的本类中定义的方法
		Method[] mt = c.getDeclaredMethods();
		System.out.println("本类中定义的方法有： ");
		for(Method m : mt) {
			System.out.println(m);
		}
		
		//获得所有的公开方法
		Method[] mt2 = c.getMethods();
		System.out.println("所有的公开方法有： ");
		for(Method m : mt2) {
			System.out.println(m);
		}
		
		//获得本类中定义的属性
		Field[] fs = c.getDeclaredFields();
		System.out.println("本类中定义的属性有： ");
		for(Field f : fs) {
			System.out.println(f);
		}
		
		//获得所有的公开属性
		Field[] fs2 = c.getFields();
		System.out.println("本类中所有的公开属性有： ");
		for(Field f : fs2) {
			System.out.println(f);
		}
		
		
		Student student = new Student();
		Class<? extends Student> cs = student.getClass();		
		
		//利用Field类设置属性
		Field f = cs.getField("name");
		f.set(student, "tom");
		
		//利用Field类获取属性
		String sname = (String) f.get(student);
		System.out.println("通过Field对象设置后获取的值：" + sname);
		
		//设置获取私有属性
		Field f2 = cs.getDeclaredField("age");
		f2.setAccessible(true);
		f2.set(student, 50);
		Integer age = (Integer) f2.get(student);
		System.out.println("通过Field对象设置后获取的值："+ age);
		
		//getDeclaredMethod.invoke()方法应用
		Method method = cs.getDeclaredMethod("study", new Class[]{int.class,double.class});
		method.invoke(student,20,30.2);
		
		//getDeclaredConstructor.newInstance方法应用
		Constructor<? extends Student> cons = cs.getDeclaredConstructor(String.class,int.class);
		cons.newInstance("sfsef",32);
		
	}

}
