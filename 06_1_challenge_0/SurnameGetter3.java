
import java.util.Scanner;
public class CarModeleGetter3{
	public String getCarModel(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your car model: ");
		String carModel = sc.nextLine();
		return carModel;
	}
}