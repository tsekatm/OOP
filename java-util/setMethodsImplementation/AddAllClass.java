import java.util.*;

public class AddAllClass{
	List<String> names = new ArrayList<>(Arrays.asList("Jerry","Bob"));
	List<String> newNames = new ArrayList<>(Arrays.asList("Penny","Dollar"));

	public List<String> addAll(){
		List<String> combinedList = new ArrayList<>(names);
		combinedList.addAll(newNames);
		return combinedList;
	}
}