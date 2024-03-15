package OOP.local;

public class Local1Main {
	public static void main(String[] args) {	
        Local1Main obj = new Local1Main();
        obj.display();
        
        Local localInstance = obj.new Local();
        localInstance.doSomething();	
		
	}
    public void display(){
		System.out.println("Displaying");
	}
		class Local {
			Local(){
				System.out.println("Constructing");
			}
            public void doSomething(){
				System.out.println("Doing something");
			}
		}
        
}
