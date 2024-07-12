public class Ex20{
	public static void main(String[] args) {
		
		int x = 10;
		int y = new Ex20().change(x);
		System.out.print(x + y);
	}

	int change(int x){
		x = 12;
		return x;
	}
}