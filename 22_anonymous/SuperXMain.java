package OOP.anonymous;

public interface SuperXMain {
	public static void main(String[] args) {
		SuperX superX = new SuperX(){
			public void doSomething() {
				System.out.println("Doing something ...");
			}
		};
		
		superX.doSomething();
	}
}

