package functional;

public class MyClass{
	public static void main(String[] args) {
		
		Interface1 interface1 = new Interface1()
		{
            public void doSomething()
            {
                System.out.println("Overridden method of a Functional Interface");
            }
        };

        interface1.doSomething();
        Interface1.staticInter();
        interface1.defInter();
	}
}