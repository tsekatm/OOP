import java.util.*;
import java.util.function.Predicate;

public class TestClass {
    public static <T> boolean checkList(List<T> list, Predicate<List<T>> p) {
        return p.test(list);
    }

// public static <T> void checkAddList(List<T> addList, Predicate<List<T>> q){
// 	return q.add(list);
// }

    public static void main(String[] args) {
        boolean predicateCheckList = checkList(new ArrayList<>(), List::isEmpty);
        System.out.println("Is it empty: " + predicateCheckList);

        List<String> list = new ArrayList(Arrays.asList("Billy", "Jana"));

        boolean checkAddList = checkList(new ArrayList<>(), addList -> addList.add(list));
        	System.out.println(checkAddList);
    }
}
//Using add() method in a predicate does not work because add is not the primary method that predicate need to implement