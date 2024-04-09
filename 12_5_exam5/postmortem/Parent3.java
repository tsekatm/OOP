public class Parent3{
	public Parent3(String name){
		System.out.println("Parent...");
	}

	public static void main(String[] args) {
		 Child3 c3 = new Child3("Joe");
		 Child4 c4 = new Child4("Jane");
	}
}

class Child3 extends Parent3{
	public Child3(String name){
		super(name);
		System.out.println("Child3...");
	}
}

class Child4 extends Parent3{
	public Child4(String name){
		super(name);
		System.out.println("Child4...");
	}
}