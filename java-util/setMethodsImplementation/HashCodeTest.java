import java.util.*;

public class HashCodeTest{

	Set<String> names = new HashSet<>(Arrays.asList("Bennie","Moss","Happy"));

	public int hashCode(){
		return names.hashCode();
	}
}