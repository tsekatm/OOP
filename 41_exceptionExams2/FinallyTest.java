public class FinallyTest{
	public static void main(String[] args)throws Exception {
		try{
			m1();
			System.out.println("A");
		}finally{
			System.out.println("B");
		}
		System.out.println("C");
	}
	public static void m1() throws Exception{
		throw new Exception();
	}
}