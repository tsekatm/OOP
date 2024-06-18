public class MyClass{
	public static void main(String[] args) {
		String s = "hello";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();

		if(s==sb)System.out.println("a");
		if(s.equals(sb)) System.out.println("b");
		if(sb.equals(s))System.out.println("c");
	}
}