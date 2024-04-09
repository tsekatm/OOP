package postmortem;

 interface AnonymousInterface{
 	
 	void didSomething();
 	int add(int a, int b);
 }	
 public class AnonymousInterfaceMain{
 	int a = 10;
 	int b = 5;
	public static void main(String[] args) {
		AnonymousInterface anonymousInterface = new AnonymousInterface(){
			public void didSomething()
			{
				System.out.println("Anonymous method");
			}

			public int add(int a, int b){
				a = a;
				b = b;
				return a + b;
			}
		};
		anonymousInterface.didSomething();
		System.out.println(anonymousInterface.add(41,50));

	}
}