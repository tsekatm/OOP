interface Sample{
	String change(int d);
}

public class SampleMain{
	public static void main(String[] args) {
		
		// Sample sample = (int d) -> "Value" + d;

	// 	Sample sample = new Sample() 
	// 	{ 
	// 		public String change(int d) { return "Value: " + d; } 
	// 	};
		// 
		// Sample sample = (int d) -> { return "Hello: " + d; };

		// Sample sample = (d) -> { return "Value: " + d; };

		Sample sample = Integer::toString;
	}


}



