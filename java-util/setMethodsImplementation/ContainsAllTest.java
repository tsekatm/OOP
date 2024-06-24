import java.util.*;

public class ContainsAllTest{
	Set<String> groceryList = new HashSet<>(Arrays.asList("Butter","Bread","Jam"));

	public boolean containsAll(Set<String> set){
		return groceryList.containsAll(set);
	}
}