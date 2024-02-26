import java.util.Scanner;

public class CarMakeGetter3{
	public String getCarMake(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the make of your car: ");
		String name = sc.nextLine();
		return name;
	}
}