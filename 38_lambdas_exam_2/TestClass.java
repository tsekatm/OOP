import java.util.*;
import java.util.function.Predicate;

public class TestClass{
	public static boolean checkList(List list, Predicate <List> p){
		return p.test(list);
	}

	public static void main(String[] args) {
		// boolean b = checkList(new ArrayList(), al -> al.isEmpty());
		boolean b = checkList(new ArrayList(), al -> al.add("Hello"));
		System.out.println(b);
	}
}