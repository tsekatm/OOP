
public class ClassA{}
class B  extends A{}
class C extends B{}
class X{
	B getB(){
	return new B();
	}
}
class Y extends X{
	public C getB(){
		return new C();
	}
	protected B getB(){
		return new C();
	}
}