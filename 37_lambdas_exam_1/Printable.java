interface Printable{
	String isPrintable(double d);
}

class MyPrintable {
	public static void main(String[] args) {
		Printable printable = (d) -> "Yes";
	}
}
	