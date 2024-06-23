import java.util.*;

public class ToArrayTest {
    private List<String> groceryList = new ArrayList<>(Arrays.asList("bread", "butter", "jam"));

    public String[] toArrayMethod() {
        return groceryList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        ToArrayTest arrayTest = new ToArrayTest();
        String[] groceryArray = arrayTest.toArrayMethod();

        System.out.println("Elements in the array: " + Arrays.toString(groceryArray));
    }
}