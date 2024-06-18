public class CheckedTest{

	public static void main(String[] args) {
		try{
			CheckedTest myObject = new CheckedTest();
			myObject.doSomething();
		}

		catch(Exception e){
			e.printStackTrace();
		}

		finally{
			System.out.println("Finished");
		}

	}
}
