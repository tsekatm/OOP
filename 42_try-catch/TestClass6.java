public class TestClass6{
	public static void main(String[] args) {
		try{
			int x = 0;
			int y = 5/x;
		}
		// catch(Exception e){
		// 	System.out.println("Exception");
		// }
		catch(ArithmeticException ae){
			System.out.println("ArithmeticException");
		}
		System.out.println("finished");
	}
}