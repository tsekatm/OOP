package myabstract;

public class Main{
	public static void main(String[]args){
		MyAbstractClass obj1 = new MyAbstractClass("Tebogo",39){

			public void doSomething(){
				System.out.println("Do something:");
			}
		};
		obj1.doSomething();
	}
}