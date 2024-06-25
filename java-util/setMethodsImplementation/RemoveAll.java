import java.util.*;

public class RemoveAllTest{
	Set<String> names = new HashSet<>(Arrays.asList("Ben","Jerry","Jan"));

	public boolean removeAll(Set<String> name){
		return names.containsAll(name);
	}
}