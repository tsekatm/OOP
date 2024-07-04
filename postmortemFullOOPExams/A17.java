public class A17{
	public void describe(){
		System.out.println("This is A");
	}
}

interface B{
	void describe();
}

class C extends A17 implements B{
	@Override
	public void describe(){
		System.out.println("This is C");
	}
}

class Bob{
	public static void main(String[] args) {
		C obj2 = new C();
		A17 obj3 = obj2;
		((C) obj3).describe();
		((A17) obj3).describe();
		((B) obj3).describe();

	}
}