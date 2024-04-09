package postmortem;

public class MyClass implements MyInterface{
	 int i = 55;
	  public void show(){
		System.out.println("MyClass default method");
	}
	public void shows(){
		System.out.println("Abstract method from myInterface");
	}

	static void display(){
		System.out.println("static method");
	}

	public static void myMethod(int i){
        i = i;
        System.out.println("MyClass i: " +i);
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		System.out.println(myClass.i);
		// System.out.println(myClass.display); //not compiling. method not inherited from interface

		MyClass.myMethod(5);

		System.out.println(myClass.i);
	}
	 class MyClassB{
	 	public static void myMethod(int i){
        i = i;
        System.out.println("MyClassB i: " + i);

	    }

	 }
	 
}