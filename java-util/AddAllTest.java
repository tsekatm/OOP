import java.util.*;

public class AddAllTest {
    private List<String> names = new ArrayList<>(Arrays.asList("Charles", "James", "Kristry"));
    private List<String> surnames = new ArrayList<>(Arrays.asList("Simons", "Zulu", "Grant"));

    public List<String> addAll() {
        List<String> combinedList = new ArrayList<>(names);
        combinedList.addAll(surnames);
        return combinedList;
    }

    public static void main(String[] args) {
        AddAllTest addSurnames = new AddAllTest();
        List<String> combinedList = addSurnames.addAll();
        
        System.out.println("Combined list of names and surnames: " + combinedList);
    }
}