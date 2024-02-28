public class Nested1Main {
	public static void main(String[] args) {
		NestedExample1 outer = new NestedExample1();
		NestedExample1.Inner inner = outer.new Inner();
	}
}
