import java.time.*;

public class Test17{
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		System.out.println(Duration.between(d1, d2));
	}
}