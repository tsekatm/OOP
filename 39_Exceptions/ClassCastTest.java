public class ClassCastTest {
	public static void main(String[] args) {
		
		Object exception = new Object();
		
		System.out.println("Step 1");
		
		Object exception2 = exception;
		
		System.out.println("Step 2");
	}
}
