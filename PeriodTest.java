import java.time.LocalDate;
import java.time.Period;
import java.time.Month;

public class PeriodTest {
    public static void main(String[] args) {
        
        LocalDate currentDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(1984, Month.OCTOBER, 1);
        Period p = Period.between(birthday, currentDate);
        long yearsToSubtract = 5;
        p = p.minusYears(yearsToSubtract);

        System.out.println("You are " + p.getYears() + "years, "+ p.getMonths()+ "months, and " + p.getDays() + "days old.");
    }
}
