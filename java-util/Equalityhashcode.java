public class Equalityhashcode{
	public static void main(String[] args) {
		
		String a = new String("whatever");
		String b = new String("A");

		boolean result = a.equals(b);
		System.out.println(result);

		boolean result2 = a.hashCode() == b.hashCode();
		System.out.println(result2);

	}
}