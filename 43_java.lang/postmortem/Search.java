public class Search{
	public static void main(String[] args) {
		String s = "Contentment";

		int middle = s.length()/2;
		System.out.println("middle: " + middle);
		String nt = s.substring(middle-1, middle+1);
		System.out.println("nt: " + nt);
		System.out.println(s.lastIndexOf(nt, middle));
	}
}