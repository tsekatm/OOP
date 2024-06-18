public class TestClass36{
	static int a;
	int b;

	public TestClass36(){
		int c;
		c = a;
		a++;
		b += c;
	}
	public static void main(String[] args) {
		new TestClass36();
	}
}