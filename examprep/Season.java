enum Season{
	SUMMER, WINTER, SPRING, FALL
}

public class Test{
	public static void main(String[] args) {
		
		Season s = Season.SPRING;
		switch(s){
		case SUMMER: System.out.println("SUMMER");
		case WINTER: System.out.println("WINTER");
		default: System.out.println("SEASON");

		}
	}
}