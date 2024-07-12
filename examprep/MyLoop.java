public class MyLoop{
	public static void main(String[] args) {
		
		String[] sa = {"tom","jerry"};
		for(int x = 0; x < 3; x++){
			for(String s : sa){
				System.out.println("outer loop x = " + x + " " + "inner Loop s: " +  s);
			    if(x == 1){
				continue;
			    }
			}
		}
	}
}