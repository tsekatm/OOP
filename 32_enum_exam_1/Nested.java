public class Nested{
	private String x = "Outer";

	void doStuff(){
		String z = "local variable";

		class MyInner{
			public void seeOuter(){
				System.out.println("Outer x is: " + x);
				System.out.println("local variable z is: " + z);
			}
		}

		new MyInner().seeOuter();
	}
	public static void main(String[] args) {
		new Nested().doStuff();
	}
}