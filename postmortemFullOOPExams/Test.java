public class Test implements Sample{
	public static void meth(){
		System.out.println("I am a static and default...");
	}

	public static void meth2(){
		System.out.println("Keep it up");
	}

	public void meth3(){
		System.out.println("You are awesome!");
	}
	public static void main(String[] args) {
		Sample.meth2();
		Test.meth();
	}
}

interface Sample{
	public void meth3();

	static void meth(){
		System.out.println("Try again...") ;
	}
	public static void meth2(){
		System.out.println("Keep it up!");
	}
}