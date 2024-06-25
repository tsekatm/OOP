import java.util.*;

public class SetMethodsTest{

	public static void main(String[] args) {
		Set<String> names = new HashSet<>(Arrays.asList("Bennie","Moss","Happy"));
	
		System.out.println("Original elements" + names);

		names.add("Dineo");
		names.add("Moss");//Moss does not get added to the set because it already exists
		names.add("James");

		System.out.println("updated elements: " + names);
		Set<String> newNames = new HashSet<>(Arrays.asList("Jack","Daniel","Suzan"));
		names.addAll(newNames);

        // addAll
		System.out.println("updated elements: " + names);

		
		System.out.println("iterated elements:");
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()){
			String name = iterator.next();
			System.out.print(name + " ");
		}
		System.out.println();

		boolean check = names.containsAll(newNames);
		System.out.println("Contains all: " + check);
		System.out.println("updated elements: " + names);
		System.out.println("Size of the set: " + names.size());

		names.hashCode();
		System.out.println("hashcode: " + names.hashCode());
		System.out.println("hashcode: " + Arrays.toString(names.toArray(new String[0])));
        names.clear();
		System.out.println("Cleared set" + names);
	}
	

}