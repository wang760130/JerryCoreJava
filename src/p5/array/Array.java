package p5.array;
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//一维数组的声明方式
//		int[] a;  //一般用这种
//		int a[];
		
		//一维数组分配空间
//		int[] a;
//		a = new int[5];
		
//		int[] a = new int[5];
		
		//一维数组创建的其他方式
//		int[] a = {1,3,4};
//		int[] a = new int[] {1,3,4};
	
		int[] a1 = {1,3,4,4,5,2,2,1,4};
		
		//数组排序
		//java.util.Arrays.sort(array);   把array从小到大排序
		java.util.Arrays.sort(a1);
		print1(a1);
		
		//数组扩充第一种方式 for循环
		int[] b1 = new int[a1.length*2];
		for(int i = 0; i<a1.length; i++) {
			b1[i] = a1[i];
		}
		
		//数组扩充第二种方式 System.arraycopy
		int[] b2 = new int [a1.length*2];
		//从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束
		System.arraycopy(a1, 0, b2, 0, a1.length);
		
		//数组扩充第三种方式 java.util.Arrays.copyOf JDK1.6开始
		//复制指定的数组，截取或用 false 填充（如有必要），以使副本具有指定的长度
		int[] b3 = copyOf(a1,2*a1.length);
		a1 = b3;
		
		
		//二维数组的创建方式
		int[][] a=new int[2][3];
		a[0][0]=4;
		a[0][1]=2;
		a[0][2]=9;
		a[1][0]=4;
		a[1][1]=9;
		a[1][2]=7;
//		print2(a);
	}
	
	
	private static int[] copyOf(int[] a1, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	//一维数组的遍历
	public static void print1(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	//二维数组的遍历
	public static void print2(int[][] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
