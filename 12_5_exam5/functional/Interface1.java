package functional;

public interface Interface1{
	abstract void doSomething();
	static void staticInter()
	{
		System.out.println("Static Inter");
	}
    default void defInter()
    {
    	System.out.println("Default inter");
    }
}