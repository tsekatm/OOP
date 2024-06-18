interface Foldable{
	public void fold() throws Exception;
}

class Paper implements Foldable{
	public void fold(){
		System.out.println("Fold");
	}
}

public class Tester10{
	public static void main(String[] args) {
	    Foldable obj1 = new Paper();
	    obj1.fold();
	    Paper obj2 = new Paper();
	    obj2.fold();

	}
}