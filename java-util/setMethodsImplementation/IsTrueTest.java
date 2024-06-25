import java.util.*;

public class IsEmptyTest{

	Set<String> names = new HashSet<>(Arrays.asList("Bennie","Moss","Happy"));

	public boolean isEmpty(){
		return names.isEmpty();
	}
}