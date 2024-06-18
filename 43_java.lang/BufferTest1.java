public class BufferTest1{
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("My name is ");
		System.out.print(builder.append("Tebogo").insert(17," Tseka"));
	}
}