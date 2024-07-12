public class ConditionalsTesting{
	public static void main(String[] args) {
		int hourOfDay = 10;

		if(hourOfDay < 11){
			System.out.println("Good morning");
		}else if (hourOfDay < 15) {
			System.out.println("Good afternoon");
		}else{
			System.out.println("Good evening");
		}
	}
}