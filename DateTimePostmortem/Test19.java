import java.time.*;

public class Test19{
	public static void main(String[] args) {
		
		LocalDate t1 = LocalDate.now();
		LocalDateTime t2 = LocalDateTime.now();
		System.out.println(Duration.between(t2, t1));
	}
}