package postmortem;

public class EBook extends Document implements Printable{

	public static void main(String[] args) {
		
		Printable printable = new EBook();

		printable.display();
	}
}