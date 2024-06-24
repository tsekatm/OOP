import java.util.*;

public class ContainsTest{

	Set<String> groceryList = new HashSet<>(Arrays.asList("Butter","Bread","Jam"));

	public boolean contains(String list){
		return groceryList.contains(list);
	}
}