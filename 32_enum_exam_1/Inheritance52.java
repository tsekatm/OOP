public class Inheritance52 extends Inheritance51{
	public void sayHello(){
		System.out.println("Hello2");
	}

	public static void main(String[] args) {
		Inheritance51 a = (Inheritance51) new Inheritance52();
		Inheritance52 b = new Inheritance52();

		a.sayHello();
		b.sayHello();
	}
}