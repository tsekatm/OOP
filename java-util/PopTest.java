import java.util.*;

public class PopTest{
	private List<String> names = new ArrayList<>(Arrays.asList("John", "Marcia", "Musa"));
	public boolean pop(String name){
		return names.remove(name);
	}

	public List<String> getNames(){
		return names;
	}

	public static void main(String[] args) {
		PopTest popNames = new PopTest();
		boolean removed = popNames.pop("Marcia");
		removed = popNames.pop("John");
		System.out.println("Names removed: " + removed);
		System.out.println("Updated list: " + popNames.getNames());
	}
}
