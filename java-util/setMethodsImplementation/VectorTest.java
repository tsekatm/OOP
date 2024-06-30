import java.util.*;

public class VectorTest{
	public static void main(String[] args) {

		
		Vector<String> set = new Vector<>();

		set.add("Mahlatse");
		set.add("Tshego");
		set.add("Bontle");
		set.add("Naledi");
		set.add("Tebogo");
		set.add("Sello");
		System.out.println("original set" + set);
        
        System.out.print("Iterated Names: ");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String names = iterator.next();
			System.out.print(names + " ");
		}
		System.out.println();

		Vector<String> list = new Vector<>(set);
		Collections.sort(list);
		System.out.println("Sorted list: " + list);

		System.out.println("Synchronised list: " + Collections.synchronizedList(list));



	}
}