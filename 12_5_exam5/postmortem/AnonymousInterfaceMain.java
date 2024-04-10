package postmortem;

 interface AnonymousInterface{
 	
 	int add(int a, int b);
    default int sub(int a, int b){
    	a = a;
    	b = b;
    	System.out.println("default method, sub" + (a - b));
    	return a - b;
    }
 	void doSomething();
 	static void display(){
 		System.out.println("Static method, display: Interface method");
 	}
 }	


 public class AnonymousInterfaceMain{
	public static void main(String[] args) {
		AnonymousInterface anonymousInterface = new AnonymousInterface(){
			
			public int add(int a, int b){
				a = a;
				b = b;
				System.out.println("abstract method, add: " + (a + b));
				return a + b;
			}
			static void display(){
 		        System.out.println("Static method, display: Interface method");
 	        }  
			
			public void doSomething(){
				System.out.println("abstract method, doSomething: Hello");
			}

			public int sub(int a, int b){
				a = a;
				b = b;
    	        System.out.println("default method, sub: " +(a - b));
    	        return a - b;
            }

		};
		anonymousInterface.add(41,50);
		anonymousInterface.doSomething();
		AnonymousInterface.display();
		anonymousInterface.sub(100,50);



	}
}