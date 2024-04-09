package postmortem;

public interface Printable{
	void display();
	void doingSomething();
}
class Document{
	public void display(){
		System.out.println("Display");
	}
}
