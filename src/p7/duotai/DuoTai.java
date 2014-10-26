package p7.duotai;

public class DuoTai {
	public static void main(String args[]){
		Dog3 d=new Dog3();		
		d.sleep1();
		d.s();
		Animal3 w=new Dog3();
		//w.sleep1();  //不能调用 由于从定义来的 他只能调用父类的对象
		w.sleep();
		w.s();//调用的是覆盖的对象
		Animal3 a=new Dog3();
		//Dog3 g=a;   //错误
		Dog3 f=(Dog3)a;       //正确这就是强制类型转换
		f.sleep();
		Animal3 y=new Dog3();
		y.sleep();
	}
}
class Animal3{
	int age;
	String sex;
    public void sleep(){
		System.out.println("sleep 9 out");
		@SuppressWarnings("unused")
		Animal3 y=new Animal3();
		}
	public void s(){
		System.out.println("sleep 10 out");
	}
	public static Animal3 getAnimal33(Animal3 a){
		System.out.print("sadad");
		a.sleep();
		return a;
	}
}

class Dog3 extends Animal3{
	public void sleep1(){
		System.out.println("sadadas");
	}
	public void s(){
		System.out.println("sleep 20 out");
	}
	public void sleep(){
		
		System.out.println("sadadas");
	}
	public static Dog3 getDog3(Dog3 a){
		a.sleep();
		return a;
	}
}

class Cat3 extends Animal3{
	public static Cat3 getCat3(Cat3 a){
		a.sleep();
		return a;
	}
	
    public void sleep(){
		System.out.println("rwqwrq");
	}
}
