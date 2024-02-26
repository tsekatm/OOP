
import java.util.Scanner;
public class CarYearModelGetter{
	public int getCarYearModel(){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your car's year model ");
		int carYearModel = sc.nextInt();
		return carYearModel;
	}
}