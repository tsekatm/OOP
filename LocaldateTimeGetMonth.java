import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeGetMonth {
    public static void main(String[] args) {
   		 LocalDateTime currentDate =LocalDateTime.now();
         Month currentMonth = currentDate.getMonth();
   		 System.out.println("Current month is : " + currentMonth);
   		 
    }
}