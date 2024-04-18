class Car{
	public int gearRatio = 8;
	public String accelerate(){
		return "Accelerate: Car";
	}
}

	public class SportsCar extends Car{
		public static int gearRatio = 9;
		public String accelerate(){
			return "Accelerate: SportsCar";
		}
		public static void main(String[] args) {
			Car c = new SportsCar();
			System.out.println(c.gearRatio + c.accelerate());
		}
	}
