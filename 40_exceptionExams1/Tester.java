import java.io.IOException;
class Father{
	public Father()throws IOException{
		System.out.println("Father");
		throw new IOException();
	}
}

class Son extends Father{
	public Son() throws IOException{
		System.out.println("Son");
	}
}

public class Tester{
	public static void main(String[] args) {
		try{
			new Son();
		}
		catch(IOException e){
			System.out.println("Inside catch");
		}
	}
}