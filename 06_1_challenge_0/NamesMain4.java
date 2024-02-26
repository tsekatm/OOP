
public class NamesMain4{
	public static void main(String[] args) {

		CarYearModelGetter getter = new CarYearModelGetter();
		CarMakeGetter getter1 = new CarMakeGetter();
		CarModeleGetter getter2 = new CarModeleGetter();

		String carMake;
		String carModel;
		int carYearModel;

        carMake = getter1.getCarMake();
        carModel  = getter2.getCarModel();
        carYearModel = getter.getCarYearModel();
		System.out.println("Hello. You drive a " + carYearModel + " " + carMake + carModel);
	}
}