class A{
	A(){
        print();
	}
	void print(){
		System.out.println("A");
	}
}

 class B extends A{
	B(){
		print();
	}
	void print(){
		System.out.println("B");
	}
}

public class C extends B{
	int i = Math.round(3.5f);

	public static void main(String[] args) {
		C a = new A();
		a.print();
	}

	void print(){
		System.out.println(i);
	}
}

