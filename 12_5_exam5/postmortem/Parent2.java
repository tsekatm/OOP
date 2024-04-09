public class Parent2{
	public Parent2(){
		System.out.println("Parent...");
	}

	public static void main(String[] args) {
		 Child3 c3 = new Child3("Joe");
		 Child4 c4 = new Child4("Jane");
	}
}

class Child3 extends Parent2{
	public Child3(String name){
		super();
		System.out.println("Child3...");
	}
}

class Child4 extends Parent2{
	public Child4(String name){
		System.out.println("Child4...");
	}
}