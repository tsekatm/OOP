package exams1;

public class OBJTest1 extends OBJTest0{
	public OBJTest1(){
		super("hello");
		System.out.println("OBJTest1:"+"hello");
	}
	public OBJTest1(String param){
		super(param);
	}
	public static void main(String[] args) {
		new OBJTest1();
	}
}