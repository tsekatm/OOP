package postmortem;

public class A{
	private int methodOne(int i){
		return ++i;
	}
	public int methodTwo(int i){
		return methodOne(++i);
	}
}