package postmortem2;

public class Params34{
	public static void main(String[] args) {
		Printer printer = createPrinter("Peter");

		printer.print();
	}

	private static Printer createPrinter(String name){
		final String name1 = null;
		return new Printer(){
			@Override
			public void print(){
				System.out.println("Hello: " +name1.toString());
			}
		};
	}
}