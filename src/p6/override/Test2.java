package p6.override;

public class Test2 {
	public static void main(String args[]){
		Cat1 c=new Cat1();
	    c.sleep();
		c.age=20;
		c.sleep();
		Dog1 w=new Dog1();
		w.sead(20);		
	}
}

//这是父类 
class Animal1{  
	  int age;
	  String sex;
	  public void eat(){
		  System.out.println("eat food");
	  }
	  public void sleep(){
		  System.out.println("sleep 8 hours");
	  }
	  public void sead(int a){
		  System.out.println(" "+a+" ");
	  }  
}

//这是子类  继承了父类的一切
class Dog1 extends Animal1{  
	public void call(){
		super.age=12;
		System.out.print("ao ao "+age);  
	  }	
}

//这是子类  继承了父类的一切		 
class Cat1 extends Animal1{
	public void sleep(){
		System.out.println();
		int age=11;
		System.out.println("this.age="+this.age);
		System.out.println(age);
		System.out.println(super.age);
		
		//调用的是父类的对象 从而扩展父类
		super.sleep();
		
		//方法的覆盖也是方法的重写 这个覆盖了父类的sleep()；
		System.out.println("sleep 6 hours");
		
		//age表示你这个类定义的值
		if(age==20){ 
			//方法的覆盖也是方法的重写 这个覆盖了父类的sleep()；
			System.out.println("sleep 19 hours");
		}
		//super.age 也表示你付值
		if(super.age==20){  
			//方法的覆盖也是方法的重写 这个覆盖了父类的sleep()；
			System.out.println("sleep 20 hours");
		}
		
		//this.age 也表示你付值  //应深刻理解this的含义，表示当前对象，this.age 即使c.age
		if(this.age==20){ 
			//方法的覆盖也是方法的重写 这个覆盖了父类的sleep()；
			System.out.println("sleep 21 hours");
		}
	}
}
