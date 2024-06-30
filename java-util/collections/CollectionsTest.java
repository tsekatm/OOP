import java.util.*;

public class CollectionsTest{
	public static void main(String[] args) {
		
		List<Integer> collectionList = new ArrayList<>(Arrays.asList(1,3,6,4,88,67,55));
		System.out.println("Unsorted collection: " + collectionList);
		System.out.println();
		Collections.sort(collectionList);
		System.out.println("Sorted collection: " + collectionList);

	}
}