import java.util.*;

public class SpliteratorTest{

	Set<String> names = new HashSet<>(Arrays.asList("Sonia","Palesa","Alta"));

    public Spliterator<String> spliterator(){
	return names.spliterator();
    }

}