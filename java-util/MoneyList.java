import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoneyList {

	public static void main(String[] args) {
		
		Map<String,List<Money>> outerMap = new HashMap<String,List<Money>>();
		
		List<Money> sharingList = new ArrayList<Money>();
		
		sharingList.add(new Money(Currency.USD, 1));
		sharingList.add(new Money(Currency.USD, 10));
		sharingList.add(new Money(Currency.USD, 20));
		sharingList.add(new Money(Currency.USD, 50));
		sharingList.add(new Money(Currency.USD, 100));

		
		outerMap.put("Sly",sharingList);
		outerMap.put("Slicko",sharingList);
		outerMap.put("No3",sharingList);
		outerMap.put("John",sharingList);
		
		
		System.out.println("outerMap = "+outerMap);
	}
}
