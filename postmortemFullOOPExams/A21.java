public class A21{
	int i;

	public A21(int x){
		this.i = x;
	}
}
class B extends A21{
	int j;
	
	public B(int x, int y){
		super(x);
		this.j = y;
	}
	B(int y){
		super(y*2);
		j = y;
	}
	// B(int z){
	// 	this(z,z);
	// }
}