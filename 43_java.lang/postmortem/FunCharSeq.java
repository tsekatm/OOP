public class FunCharSeq{
	private static void put0(String s1){
		s1 = s1.trim();
		s1 += "0";
	}
	public static void main(String[] args) {
		String s1 = " W ";
		put0(s1);
		s1.concat("W");
		System.out.println("|" + s1 + "|");
	}
}