import java.util.*;

public class MoneyLists2 {
	public static void main(String[] args) {
		List<Money> list1 = new ArrayList<Money>();
		
		list1.add(new Money(Currency.GBP, 5));
		list1.add(new Money(Currency.GBP, 5));
		list1.add(new Money(Currency.GBP, 5));
		list1.add(new Money(Currency.GBP, 5));
		list1.add(new Money(Currency.GBP, 5));
		list1.add(new Money(Currency.GBP, 5));
		list1.add(new Money(Currency.GBP, 5));
		list1.add(new Money(Currency.ZAR, 1));
		list1.add(new Money(Currency.ZAR, 1));
		list1.add(new Money(Currency.ZAR, 1));
		list1.add(new Money(Currency.ZAR, 1));
		list1.add(new Money(Currency.ZAR, 1));
		list1.add(new Money(Currency.ZAR, 1));

		
		System.out.println("list1 = "+list1);
		
	}
}
