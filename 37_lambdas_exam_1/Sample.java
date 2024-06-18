interface Sample{
	String change(int d);
}

public class SampleMain{
	public static void main(String[] args) {
		
		Sample sample = (int d) -> "Value" + d;
	}
}



