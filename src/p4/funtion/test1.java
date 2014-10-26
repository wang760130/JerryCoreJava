package p4.funtion;

public class test1 {
	public static void main(String[] args){
		print(5,6);
		System.out.println("-------------");
		print(7,7);
	}


	public static void print(int a,int b){
		/*因为只是向控制台中输出数据不用返回数据所以用void*/ 
		for(int i=1;i<=b;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");				
			}
			System.out.println();		
	    }
		
		for(int i=1;i<=a;i++){
			for(int j=b-1;j>=i;j--){
				System.out.print(" ");	        
			}
			
			for(int h=1;h<=i*2-1;h++){
				System.out.print("*");
		    }
				
			System.out.println();
		}
	}
}
