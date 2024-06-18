public class CatchingEg2Main {
	public static void main(String[] args) {
		System.out.println("Start");
		try{
			CatchingEg2 myObject = new CatchingEg2();
		    myObject.doSomething();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Finished");
	}
}
