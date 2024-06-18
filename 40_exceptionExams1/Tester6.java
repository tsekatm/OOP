class Father{
	public Father() throws RuntimeException{
		System.out.println("Father");
		throw new RuntimeException();
	}
}

class Son extends Father{
	public Son() throws RuntimeException{
		System.out.println("Son");
	}
}

public class Tester6{
	public static void main(String[] args) {
		new Son();
	}
}