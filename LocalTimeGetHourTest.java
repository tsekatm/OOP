import java.time.LocalTime;

public class LocalTimeGetHourTest {
    public static void main(String[] args) {
   		 LocalTime currentTime =LocalTime.now();
         int currentHour = currentTime.getHour();   		 
   		 System.out.println("the current hour is : "+ currentHour) ;
   		 
    }
}