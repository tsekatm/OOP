import java.util.*;

public class ToArrayTest{

	Set<String> names = new HashSet<>(Arrays.asList("Wealth","Joy","Gratitude"));

	public String[] toArray(){
		return names.toArray(new String[0]);
	}
 
}