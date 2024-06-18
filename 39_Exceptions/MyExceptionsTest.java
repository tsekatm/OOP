public class MyExceptionsTest {
	static MyExceptions myExceptions;
	public static void main(String[] args) {
		System.out.println("Start");
        try{
        	myExceptions.display();
        }

        catch(NullPointerException e){
        	System.out.println("An exception occured");
        }
        System.out.println("Finished");
    }
}