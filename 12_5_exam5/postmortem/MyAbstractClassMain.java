package postmortem;

abstract class MyAbstractClass{
	String name;
	abstract void show();
	public MyAbstractClass(String name){
        this.name = name;
		System.out.println("I'm a constructor" + name);
	}
}

public class MyAbstractClassTest extends MyAbstractClass{
	public static void main(String[] args) {
		MyAbstractClassMain myAbstract = new MyAbstractClass(){
			public void show(){
				System.out.println("An abstract method, show");
			}
			public MyAbstractClassTest(){
	    	    super("Bobbie");
	    	    System.out.println("No args constructor");
	        }

		};
	    
	}
}