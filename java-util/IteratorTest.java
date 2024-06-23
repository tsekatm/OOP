import java.util.*;

public class IteratorTest {
    private List<String> groceryList = new ArrayList<>(Arrays.asList("bread", "butter", "jam"));

    public Iterator<String> iterator() {
        return groceryList.iterator();
    }

    public static void main(String[] args) {
        IteratorTest iteratorTest = new IteratorTest();
        Iterator<String> iterator = iteratorTest.iterator();

        System.out.print("Elements in the list: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if(iterator.hasNext()){
            	System.out.print(", ");
            }
        }
    }
}