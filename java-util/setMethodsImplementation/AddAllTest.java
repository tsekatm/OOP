import java.util.*;

public class AddAllClass{
	Set<String> names = new HashSet<>(Arrays.asList("Jerry","Bob"));
	Set<String> newNames = new HashSet<>(Arrays.asList("Penny","Dollar"));

	public Set<String> addAll(){
		Set<String> combinedList = new HashSet<>(names);
		combinedList.addAll(newNames);
		return combinedList;
	}
}