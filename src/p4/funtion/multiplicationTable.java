package p4.funtion;

public class multiplicationTable {
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				int m=i*j;				
				System.out.print(i+"*"+j+"="+m+" ");
					if(m<10){
						System.out.print(" ");
					}
			     }			
			System.out.println();
			}
	   }
}
