enum MyEnums{
	AAA, BBB, CCC;

	enum Enums{
		AAA, BBB, CCC;
	}
}

public class MainClass27{
	public static void main(String[] args) {
		MyEnums myEnum1 = MyEnums.AAA;
		MyEnums.Enums  myEnum2 = MyEnums.Enums.AAA;
		System.out.println(myEnum1 == myEnum2);
	}
}