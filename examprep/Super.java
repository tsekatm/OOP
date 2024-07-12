public class Super{
	int age;
	String name;
	Super(){}
	public Super(String name, int age){
		this.name = name;
		this.age = age;
	}


}

class Sub extends Super{
	int num;
	Sub(int age){
		this();
		System.out.println("sub constructor");
	}

}