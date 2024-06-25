import java.util.*;

public class SetTest{
	public static void main(String[] args) {

		
		Set<String> set = new HashSet<>();

		set.add("Mahlatse");
		set.add("Tshego");
		set.add("Bontle");
		set.add("Naledi");
		set.add("Tebogo");
		set.add("Sello");
		System.out.println("original set" + set);
        
        System.out.print("Values: ");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String values = iterator.next();
			System.out.print(values + " ");
		}
		System.out.println();

		List<String> list = new ArrayList<>(set);
		Collections.sort(list);
		System.out.println("Sorted list: " + list);

		System.out.println("Synchronised list: " + Collections.synchronizedList(list));



	}
}