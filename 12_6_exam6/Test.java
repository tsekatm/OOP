class Super{
	static String ID = "QBANK";
}

class Sub extends Super{
	static{
		System.out.println("In Sub");
	}
}

public class Test{
	public static void main(String[] args) {
		Sub s = new Sub();
		System.out.println(Sub.ID);
	}
}