interface SuffixFunction{
	void call();
}

public class Latin{
	public static void main(String[] args) {
		String word = "hello";
		SuffixFunction suffixFunc = () -> System.out.println(word + "ay");
		// word = "e";
		suffixFunc.call();
	}
}