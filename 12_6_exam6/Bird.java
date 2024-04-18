class Bird{
	private String name;
	public Bird(){}
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}

class Eagle extends Bird{
	public String name;
	public Eagle(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		// System.out.println(new Eagle("Bald Eagle").name);

		Bird bird = new Bird();
		bird.setName("Beauty");
		String name = bird.getName();
		System.out.println(name);

	}
}