public enum Directions{
	NORTH, SOUTH, WEST, EAST;

	private Directions(){
		System.out.println(1);
	}
}
class MainClass{
	public static void main(String[] args) {
		Directions d1 = new Directions();
	}
}

