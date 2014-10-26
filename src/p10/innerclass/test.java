package p10.innerclass;

public class test {
	public static void main(String[] args) {
		
		OutClassInnerClass ocic = new OutClassInnerClass();
		ocic.getInnerClass();
		OutClassInnerClass.InnerClass ocicic = ocic.new InnerClass();
		ocicic.print();
		
		System.out.println("-------------------");
		
		OutClassStaticInnerClass.InnerClass ocsicic = new OutClassStaticInnerClass.InnerClass();
		ocsicic.print();
		OutClassStaticInnerClass ocsic = new OutClassStaticInnerClass();
		ocsic.getInnerClass();
		
		System.out.println("-------------------");
		
		OutClassPartInnerClass ocpic = new OutClassPartInnerClass();
		ocpic.TestPartInnerClass();
		
		System.out.println("-------------------");
		
		OutClassAnonymityInnerClass ocaic = new OutClassAnonymityInnerClass();
		ocaic.TestAnonymityInnerClass();
	}

}
