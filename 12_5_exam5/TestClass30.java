public class TestClass30{
	long l1;

	public void TestClass30(long pLong){
		l1 = pLong;
	}

	public static void main(String[] args) {
		TestClass30 a, b;
		a = new TestClass30();
		b = new TestClass30();
	}

	public void DoSomething(){
		System.out.println("method");
	}
}