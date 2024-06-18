import java.io.IOException;

class AirPlane{
	public AirPlane(){
		System.out.print("Airplane");
	}
}

class AirJet extends AirPlane{
	public AirJet() throws IOException{
		try{
			throw new IOException();
			}
			catch(IOException e){
				System.out.print("IOException is thrown in AirJet");
			}
		}
	}

	public class Tester7{
		public static void main(String[] args) {
			try{
				new AirJet();
			}
			catch(IOException e){
				System.out.print("IOException is thrown in Tester");
			}
		}
	}
