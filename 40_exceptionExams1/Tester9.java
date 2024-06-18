import java.io.IOException;
class AirPlane{
	public AirPlane() throws IOException, RuntimeException{
		System.out.println("Airplane");
	}
}
class AirJet extends AirPlane{}
public class Tester9{
	public static void main(String[] args)throws IOException {
		new AirPlane();
	}
}