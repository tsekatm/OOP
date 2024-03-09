public class AbstractTest01 extends AbstractTest{

	public static void main(String[] args) {

		AbstractTest01 test = new AbstractTest01();
		test.doSomething();
		
	}
	abstract public void doSomething(){
		System.out.println("Do something");
	}

}
