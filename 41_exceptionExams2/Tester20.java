public class Tester20{
	public static void main(String[] args) {
		try{
			Double d = 4.0;
			d /=0;
		}catch(ArithmeticException e){
			System.out.println("Exception");
		}finally{
			System.out.println(d);
		}
	}
}