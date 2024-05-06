public class MyLambda{
	public static void main(String[] args) {
		
		MyInterface myInterface = () -> {
			System.out.println("implementation complete");
	    };

	    myInterface.testingLambda();
	}
}
