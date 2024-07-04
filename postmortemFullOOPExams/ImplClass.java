public class ImplClass{
	public static void main(String[] args) {
		myTester((e) -> "Yes");
	}

	interface Printable{
		String isPrintable(double d);
	}
}