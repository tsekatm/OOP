import java.util.*;

public class ToArrayMethodTest{

	Set<String> names = new HashSet<>(Arrays.asList("Wealth","Joy","Gratitude"));

	public <String> String[] toArray(String[] name){
		return names.toArray(name);
	}
 
}