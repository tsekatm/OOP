package postmortem2;

public class Params31{
	public static void main(String[] args) {
		Printer banana = createPrinter("Peter");

		banana.print();
	}

	private static Printer createPrinter(final String name){
		Printer banana = new Printer(){
			@Override
			public void print(){
				System.out.println("Hello: " +name.toString());
			}
		};

		return banana;
	}
}