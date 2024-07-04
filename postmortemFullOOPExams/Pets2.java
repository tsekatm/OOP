public enum Pets2{
	DOG("D"), CAT("C"), FISH("F");
	static String prefix = "I am ";

	String name;
	Pets2(String s){
		name = prefix + s;//causes compilation error
	}

	public String getData(){
		return name;
	}
}