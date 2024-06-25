import java.util.*;

public class RetainAllTest{
	Set<String> names = new HashSet<>(Arrays.asList("Ben","Jerry","Jan"));

	public boolean retainAll(Set<String> name){
		return names.retainAll(name);
	}
}