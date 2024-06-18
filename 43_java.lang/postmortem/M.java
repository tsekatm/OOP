public class M{
	public void method(Object o){
		System.out.println("Object version");
	}
	public void method(String s){
		System.out.println("String version");
	}
	public static void main(String[] args) {
		M q = new M();
		q.method(null);
	}
}