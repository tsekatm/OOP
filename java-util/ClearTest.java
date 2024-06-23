import java.util.*;

public class ClearTest{

	private List<String> names = new ArrayList<>(Arrays.asList("Guild", "Fear","Hate"));

	public void clear(){
        names.clear();
	}

	public List<String> getNames(){
		return names;
	}

	public static void main(String[] args) {
		ClearTest clearnames = new ClearTest();
        System.out.println("Original list: " + clearnames.getNames());
        clearnames.clear();
        System.out.println("Clear list: " + clearnames.getNames());
	}
}