public class StringRef{
	String str1 = "Mary";
	String str2 = "Joseph";
	String str3 = "Tim";

	public void stringProcessor(String... strs){
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

	public static void main(String[] args) {
		StringRef stringRef = new StringRef();
		stringRef.stringProcessor();
	}

}