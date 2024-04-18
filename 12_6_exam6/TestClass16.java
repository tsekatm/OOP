class Employee{
	static int i = 10;
	{
		i = 15;
		System.out.println("Employee" + i);
	}
	static
	{
		System.out.println("Employee static" + i);
	}
}

class Manager extends Employee{
	static

	{
		i = 45;
		System.out.println("Manager static");
	}

	{
		i = 30;
		System.out.println("Manager" + i);
	}
}

class Owner extends Manager{
	static{
		System.out.println("Owner");
	}
}
public class TestClass16{
	public static void main(String[] args) {
		Manager m = new Manager();
	}
}