package postmortem;

public class MyAbstractClassTest{
	public MyAbstractClassTest(){
	    System.out.println("No args constructor");
	}
	public static void main(String[] args) {
		MyAbstractClass myAbstract = new MyAbstractClass("Jane"){
			public void show(){
				System.out.println("An abstract method, show");
			}
		}; 
	}
}