import java.util.*;

public class HashSetMethodsTest{

	public static void main(String[] args) {
		Set<String> names = new HashSet<>(Arrays.asList("Bennie","Moss","Happy"));
	
		System.out.println("Original elements" + names);
        // add
		names.add("Dineo");
		names.add("Moss");//Moss does not get added to the set because it already exists
		names.add("James");
		System.out.println("updated elements: " + names);
        System.out.println();
		// remove
		names.remove("Bennie");
		System.out.println("Updated set after remove(): " + names);
        System.out.println();
        // iterator
		System.out.println("iterated elements:");
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()){
			String name = iterator.next();
			System.out.print(name + " ");
		}
		System.out.println();

        // contains
		boolean check = names.contains("Bob");
		boolean ifIsEmpty = names.isEmpty();
		System.out.println("Contains all: " + check);
		System.out.println("Is Empty?: " + ifIsEmpty);
		System.out.println();

		// clone
		HashSet<String> clonedSet = (HashSet<String>) ((HashSet<String>)names).clone();
		System.out.println("cloned set: " + clonedSet);

		// size
		System.out.println("Size of the set: " + names.size());

        // clear
        names.clear();
		System.out.println("Cleared set" + names);
	}
	

}