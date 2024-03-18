package OOP.enums;

public class EnumTest1 {
	public static void main(String[] args) {
		Day[] values = Day.values();
        //getExcitement


		 
		for(Day day :values){
			System.out.println(day.getExcitement());
		}
	}
}
