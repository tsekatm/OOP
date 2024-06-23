import java.util.*;

public class PushTest {
    
    private List<String> names = new ArrayList<>(Arrays.asList("Naledi", "Bontle", "Tshegofatso"));
    
    public boolean push(String name) {
        return names.add(name);
    }
    
    public List<String> getNames() {
        return names;
    }
    
    public static void main(String[] args) {
        PushTest pushNames = new PushTest();
        boolean added = pushNames.push("Lethabo");
        added = pushNames.push("Mahlatse");
        System.out.println("Names added: " + added);
        System.out.println("Updated list: " + pushNames.getNames());
    }
}