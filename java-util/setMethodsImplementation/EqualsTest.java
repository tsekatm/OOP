import java.util.*;

public class EqualsTest{

	Set<String> names = new HashSet<>(Arrays.asList("Bennie","Moss","Happy"));

	public boolean equals(String name){
		return names.equals(name);
	}
}