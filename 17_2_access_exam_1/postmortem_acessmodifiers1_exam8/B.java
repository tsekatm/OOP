package postmortem_acessmodifiers1_exam8;
import postmortem.A;

class B extends A{
	int methodOne(int i){
		return methodTwo(++i);
	}
}

public class MainClass{
	public static void main(String[] args) {
		System.out.println(new B().methodOne(101));
	}
}