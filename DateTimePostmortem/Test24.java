import java.time.*;

public class Test24{
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, 11, 4);
		LocalTime time = LocalTime.of(1, 59, 59);
		ZonedDateTime dt = ZonedDateTime.of(date, time, ZoneId.of("America/New_York"));
		dt = dt.plusSeconds(1);

		System.out.println(dt.getHour() + ":" + dt.getMinute() + ":" + dt.getSecond());
	}
}