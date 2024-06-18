public class BuilderTest{
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("my name is");
		System.out.print(builder.append(" Tebogo Tseka.").insert(23," I am 39 years old"));
	}
}