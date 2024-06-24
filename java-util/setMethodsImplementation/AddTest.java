import java.util.*;

public class AddClass{
	Set<String> names = new HashSet<>(Arrays.asList("Jerry","Bob"));

	public boolean add(String name){
		return names.add(name);
	}
}