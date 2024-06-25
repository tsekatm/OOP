import java.util.*;

public class RemoveTest{

	Set<String> names = new HashSet<>(Arrays.asList("Ben","John","Willie"));

	public boolean remove(String name){
		return names.remove(name);
	}
}