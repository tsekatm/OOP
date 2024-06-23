import java.util.*;

public class ArrayListSynchronisedList{
	public static void main(String[] args) {
		
		List<String> groceryList = new ArrayList<>();
		List<String> synchronisedGoceryList = Collections.synchronizedList(groceryList);

		synchronisedGoceryList.add("Berries");
		synchronisedGoceryList.add("Bread");
		synchronisedGoceryList.add("Butter");
		synchronisedGoceryList.add("jam");

		System.out.println("Synchronized list: " + synchronisedGoceryList);
		

		

	}
}