import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {
        // Get the current ZoneId
        ZoneId currentZone = ZoneId.systemDefault();

        // Get the current date and time with the system's time zone
        ZonedDateTime now = ZonedDateTime.now(currentZone);

        // Get the LocalDate component from the ZonedDateTime
        LocalDate date = now.toLocalDate();

        System.out.println("Today's Date is : " + date);
    }
}