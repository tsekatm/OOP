import java.util.*;

public class SizeTest{

	private List<String> names = new ArrayList<>(Arrays.asList("Ben","Jane","Sidwell"));

	public List<String> getNames(){
		return names;
	}

	public int size(){
		return names.size();
	}

	public static void main(String[] args) {
		SizeTest getSize = new SizeTest();
		System.out.println("List of names" + getSize.getNames());
		System.out.println("Size of the names: " + getSize.size());
	}

}