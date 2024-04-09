
package postmortem;

public interface MyInterface{
	default void show(){
		System.out.println("MyInterface default method");
	}
	void shows();

	static void display(){
		System.out.println("static method");
	}
}