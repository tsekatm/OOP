class Nested41{
	private static int a = 7;
	static class Nested42{
		public void displayValue(){
			System.out.println("Value of a is " + a);
		}
	}
}

public class Nested43{
	public static void main(String[] args) {
		Nested41.Nested42 nested42 = new Nested41.Nested42();

		nested42.displayValue();
	}
}