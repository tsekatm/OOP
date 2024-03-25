package OOP.enums;

public class EnumTest {
	public static void main(String[] args) {
		Month month1 = Month.JANUARY;
		Month month2 = Month.FEBRUARY;
		 
		boolean res1 = month1.equals(month2);
		 
		System.out.println(month1+" equals "+month2+" is "+res1);
 
	}
 
}
