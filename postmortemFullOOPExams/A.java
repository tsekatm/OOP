public class A extends B{
	String surname;

	A(){

	}
	A(String surname){
		this.surname = surname;
	}
	@Override
	public String toString(){
		return "My name is A" +surname;
	}
	public static void main(String[] args) {
	System.out.println(new A());
    }
}

class B extends C{
	@Override
	public String toString(){
		return "My name is B";
	}
}
class C implements D{
	@Override
	public String toString(){
		return "My name is C";
	}
}
interface D{

}
class E{
	@Override
	public String toString(){
		return "My name is E";
	}
}

