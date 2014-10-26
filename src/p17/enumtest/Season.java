package p17.enumtest;

public enum Season {
	SPRING,
	SUMMER,
	AUTUMN,
	WINTER;
	
	public String name;
	
	//不得有公开(Public)的构造函数，这是为了避免直接对枚举类型实例化
	private Season() {
		
	}
}
