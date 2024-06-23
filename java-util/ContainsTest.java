import java.util.*;

public class ContainsTest{

	private List<String> names = new ArrayList<>(Arrays.asList("Guild", "Fear","Hate"));

	public boolean contains(String name){
		return names.contains(name);
	}

	public static void main(String[] args) {
		ContainsTest containsNames = new ContainsTest();
		boolean check = containsNames.contains("happiness");
        
        System.out.println("List contains: " + check);
	}
}