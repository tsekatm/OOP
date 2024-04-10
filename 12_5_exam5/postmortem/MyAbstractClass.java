package postmortem;

public abstract class MyAbstractClass{
	String name;
	abstract void show();
	public MyAbstractClass(String name){
        this.name = name;
		System.out.println("I'm a constructor" + name);
	}
}