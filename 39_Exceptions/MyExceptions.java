public class MyExceptions extends Exception{
	public static void main(String[] args) {

		MyExceptions obj = new MyExceptions();
		obj.display();
		
	}
	public void display(){
		System.out.println("My Exceptions");
	}
    
}