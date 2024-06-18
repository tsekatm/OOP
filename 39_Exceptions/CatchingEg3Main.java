public class CatchingEg3Main{
	public static void main(String[] args) {
		System.out.println("Start");

		try{
			throw new TebogoException("Error has occured");

		}

		catch(TebogoException e){

			e.printStackTrace();
		}
		finally{
			System.out.println("Finished");
		}
		
	}
}
