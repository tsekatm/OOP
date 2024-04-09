
public interface PrinterAnonymous{
	void display();
}

PrinterAnonymous printerAnonymous = new PrinterAnonymous(){
	public void display(){
		System.out.println("An interface method");
	}
};

printerAnonymous.display();