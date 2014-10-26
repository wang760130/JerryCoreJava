package p14.io;
import java.io.*;

public class ObjectStreamTest {
	public static void main(String[] args) throws Exception{
		Student stu1 = new Student("eter",23);
		Student stu2 = new Student("care",21);
		
		FileOutputStream fos = new FileOutputStream("ObjectStream.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stu1);
		oos.writeObject(stu2);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("ObjectStream.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object reStu1 = ois.readObject();
		Object reStu2 = ois.readObject();
		((Student)reStu1).showInfo();
		((Student)reStu2).showInfo();
		ois.close();
	}
}
