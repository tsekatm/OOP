import java.util.*;

public class AddClass{
	List<String> names = new ArrayList<>(Arrays.asList("Jerry","Bob"));

	public boolean add(String name){
		return names.add(name);
	}
}