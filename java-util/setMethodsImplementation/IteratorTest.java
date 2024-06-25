import java.util.*;

public class IteratorTest{
	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>(Arrays.asList("Durban","Pretoria","Johannesburg"));
		Iterator<String> iterator = cities.iterator();
		while(iterator.hasNext()){
			String city = iterator.next();
			System.out.print(city + " ");
		}
        
	}
	

}