import java.time.LocalDateTime;
import java.time.format.DatetimeFormatter;

public class DateTimeFormatterTest{
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();

		System.out.println("Before: " + now);
		DateTimeFormatter formatter = DatetimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		String formatDateTime = now.format(formatter);

		System.out.println("After : " + formatDateTime);
	}
}
