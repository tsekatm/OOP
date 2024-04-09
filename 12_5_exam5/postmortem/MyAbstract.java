package postmortem;

public abstract class MyAbstract implements Printable{
    int a = 90;
	public void display(){
		System.out.println("Printable interface method");
	}

	public static void doSomething(){
		System.out.println("Static method");
	}

	public static void main(String[] args) {
        doSomething();
	}
}