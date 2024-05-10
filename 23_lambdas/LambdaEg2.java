import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEg2 {
   public static void main(String[] args) {
       List<String> friends =
               new ArrayList<String>(Arrays.asList("1Brian", "Nate", "Neal", "Raju", "Sara", "Scott"));

       friends.replaceAll(String::toUpperCase);
       System.out.println(friends);
   }
}
