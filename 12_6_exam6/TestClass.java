class Base{
	public short getValue(){
		return 1;
	}
}
class Base2 extends Base{
	public short getValue(){
		return 2;
	}
}

public class TestClass{
	public static void main(String[] args) {
		Base b = new Base2();
		System.out.println(b.getValue());
	}
}