package OOP.enums;

public class EnumTest1 {
	public static void main(String[] args) {
		Month[] values = Month.values();
		 
		for(Month month :values){
			System.out.println(month);
		}
	}
}
