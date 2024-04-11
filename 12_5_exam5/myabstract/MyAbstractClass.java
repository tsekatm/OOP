package myabstract;

public abstract class MyAbstractClass{
	private String name;
	private int age;
	private String dob;
	abstract void doSomething();
	public MyAbstractClass(String name, int age){
		this("5/10/1984");
		this.name = name;
		this.age = age;
		System.out.println("Constructor1: " + name + age);
	}

	public MyAbstractClass(String dob){
		this.dob = dob;
        System.out.println("Constructor2: " + dob);
	}
}