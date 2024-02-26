import java.util.Scanner;

public class CarMakeGetter{
	public String getCarMake(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the make of your car: ");
		String carMake = sc.nextLine();
		return carMake;
	}
}