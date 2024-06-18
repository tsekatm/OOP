public class InitErrorTest {	
	static Object member = "love";
	
	static{
		member.toString();
	}
	
	public static void main(String[] args) {	
		System.out.println("Step 1");
	}
}
