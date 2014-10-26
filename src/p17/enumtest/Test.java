package p17.enumtest;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Season[] ss = Season.values();
		//	name()   //枚举名	ordinal()  //枚举值的顺序
		for(Season s:ss) {
			System.out.println("name: "+s.name()+ ", ordinal: " + s.ordinal());
		}
		System.out.println("————");
		Season season = Season.AUTUMN;
		System.out.println(season.name());
	}
}
