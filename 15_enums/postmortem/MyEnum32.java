package postmortem;

public class MyEnum32{
	public static void main(String[] args) {
		
		MyEnum31 constant1 = MyEnum31.CONSTANT3;

		if(constant1 == MyEnum31.CONSTANT3){
			System.out.println(constant1);
		}
		for(MyEnum31 tmp : MyEnum31.values()){
			System.out.println(tmp.name());
		}
	}
}