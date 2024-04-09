package postmortem;

 public class AnonymousClassMain{
	public static void main(String[] args) {
		AnonymousClass var = new AnonymousClass(){
			public void display(){
				System.out.println("SuperClass method: display");
			}
		};

		var.display();
	}
}