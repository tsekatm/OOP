public class Tester11{
	public static void main(String[] args) {
		System.out.print("1");

		try{
			System.out.print("2");
			System.exit(0);
		}
		finally{
			System.out.print("3");
		}
	}
}