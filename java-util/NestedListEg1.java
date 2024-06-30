import java.util.ArrayList;
import java.util.List;

public class NestedListEg1 {
	public static void main(String[] args) {
		
		List<List<Money>> outerList = new ArrayList<List<Money>>();
		
		List<Money> innerList = new ArrayList<Money>();
		List<Money> innerList2 = new ArrayList<Money>();
		innerList2.add(new Money(Currency.AED, 50));
		innerList2.add(new Money(Currency.GBP, 23));

		
		innerList.add(new Money(Currency.USD, 100));
		outerList.add(innerList2);
		
		
		System.out.println("outerList = "+outerList);
	}
}

