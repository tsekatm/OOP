public class MERIT{
	public static void main(String[] args) {
		new M().m1();
		new E().m1();
		new R().m1();
		new I().m1();
		new T().m2();
	}
}

class M{
	private void m1(){
		System.out.println("M");
	}
}
class E{
	protected void m1(){
		System.out.println("E");
	}
}

class R{
	public void m1(){
		System.out.println("R");
		new E().m1();
	}
}
class I{
	void m1(){
		System.out.println("I");
	}
}
class T{
	void m2(){
		System.out.println("T");
	}
}
