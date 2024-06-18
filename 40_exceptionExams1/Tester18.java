public class Tester18{
	public static void main(String[] args) {
		String stmt = "Javachamp 2009";
		String[]arr = stmt.split(" ");

		try{
			int x = Integer.parseInt(arr[1]);
			System.out.print(x);
		}
		finally{
			System.out.print("finally");
		}
	}
}