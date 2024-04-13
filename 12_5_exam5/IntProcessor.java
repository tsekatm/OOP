public class IntProcessor{
	int int1 = 10;
	int int2 = 20;
	int int3 = 40;

	public void intProcessor(int... ints){
		System.out.println(int1);
		System.out.println(int2);
		System.out.println(int3);
	}

	public static void main(String[] args) {
		IntProcessor intProcessor = new IntProcessor();
		intProcessor.intProcessor();
	}

}