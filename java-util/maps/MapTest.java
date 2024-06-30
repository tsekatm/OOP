import java.util.*;

public class MapTest{
	public static void main(String[] args) {
		
		Map<String, Integer> student1 = new HashMap<>();
		student1.put("Tshidi",15);
		student1.put("Bennie",10);
		student1.put("Jennie",17);
		student1.put("Patrice",13);
		student1.put("Tebogo",21);

		Map<String, Integer> student2 = new HashMap<>();
		student2.put("Babeile",19);
		student2.put("Tlotlegi",33);
		student2.put("Jack",21);
		student2.put("Jane",18);
		student2.put("Deliwe",25);

		System.out.println("student1: " + student1);
		System.out.println("student2: " + student2);
		Map<String, Integer> mergedList = new HashMap<>(student1);
		mergedList.putAll(student2);

		System.out.println("Merged list: " + mergedList);
		
	}
}