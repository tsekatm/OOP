package postmortem2;

public class Params33{
	public static void main(String[] args) {
		Printer printer = createPrinter("Peter");

		printer.print();
	}

	private static Printer createPrinter(finally String name){
		return new Printer(){
			@Override
			public void print(){
				System.out.println("Hello: " +name.toString());
			}
		};
	}
}