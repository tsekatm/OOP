interface MyInterface{
	void doSomething(int n, int m);
}

public class MyLambda{
	public static void main(String[] args) {
		
		MyInterface myInterface = (n,m) -> System.out.println("my lambda");
	}
}