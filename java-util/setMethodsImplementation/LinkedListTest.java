import java.util.*;

public class LinkedListTest{
	public static void main(String[] args) {

		
		LinkedList<Integer> set = new LinkedList<>();

		set.add(1);
		set.add(4);
		set.add(11);
		set.add(34);
		set.add(100);
		set.add(55);
		System.out.println("original set" + set);
        
        System.out.print("Iterated values: ");
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()){
			Integer values = iterator.next();
			System.out.print(values + " ");
		}
		System.out.println();

		Collections.sort(set);
		System.out.println("Sorted list: " + set);

		System.out.println("Synchronised set: " + Collections.synchronizedList(set));

	}
}