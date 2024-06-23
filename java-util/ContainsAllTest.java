import java.util.*;

public class ContainsAllTest{

	private List<String> groceryList = new ArrayList<>(Arrays.asList("bread","butter","jam"));
    private List<String> groceryList2 = new ArrayList<>(Arrays.asList("bread","butter"));

	public boolean containsAll(List<String> groceryList){
		return groceryList.containsAll(groceryList2);
	}

	public static void main(String[] args) {
		ContainsAllTest containsItems = new ContainsAllTest();
		boolean check = containsItems.containsAll(containsItems.groceryList2);
		System.out.println("Contains items: " + check);
		
	}
}