import java.util.*;

public class NavigableListTest{
	public static void main(String[] args) {
		
		NavigableSet<Long> set = new TreeSet<>(Arrays.asList(9L,10L,2L,4L,3L,7L));
        
        System.out.println("Original set: " + set);
		Long lastItem = set.last();
		System.out.println("last item: " + lastItem);
		Long previousItem = set.lower(lastItem);
		System.out.println("previous item: " + previousItem);

		// Long firstItem = set.first();
		// System.out.println("first item: " + firstItem);

		// Long nextItem = set.higher(firstItem);
		// System.out.println("next item: " + nextItem);
	}
}