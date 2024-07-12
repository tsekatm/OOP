/**
 * @author Tebogo Tseka
 * - testing how constructors initialise variables
 * - constructor runs after all the fields and initialisers
 * - fields and instance initialisers run in the orcder that they were created
 * - instance initialiser has access to all fields of the class, including static fields
 * - static initialiser only has access to static fields
 * - a construcor has access to all fields of the class
 * - static variables are also known as class variables. 
 * - They belong to the clacc
 */

public class ConsructorInitialisers{
	int num;
	int a;
	static int b;

	public ConsructorInitialisers(int c){
		num = 10;
		b = 20;
		a = 30;
	}

	{
		a = 1;
		b = 2;
		num = 3;
	}
	// static{
	// 	a = 1;//causes compilation error
	// 	b = 2;
	// 	num = 3;//causes compilation error
	// }

	public static void main(String[] args) {
		ConsructorInitialisers cons = new ConsructorInitialisers(7);
		
		System.out.println("num " + cons.num);
		System.out.println("static b " +ConsructorInitialisers.b);
		System.out.println("a " + cons.a);
		System.out.println(b);
	}
}
