package postmortem2;

public class Params00{
	public static void main(String[] args) {
		NameHolder00 nameHolder = new NameHolder00();

		nameHolder.setName("Peter");
		System.out.println("My name is: " + nameHolder.getName());
	}
}
class NameHolder00{
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		name = name;
	}
}