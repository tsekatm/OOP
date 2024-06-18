public class TestClass40{
	static int si = 10;

	public static void main(String[] args) {
		new TestClass40();
	}
	public TestClass40(){
		System.out.println(this);
	}
	public String toString(){
		return "TestClass.si = " + this.si;
	}
}