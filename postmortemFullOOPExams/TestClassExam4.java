public class TestClassExam4{
	void proble(int... x){
		System.out.println("In...");//1
	}

	void probe(Integer x){
		System.out.println("In Integer");//2
	}

	void probe(long x){
		System.out.println("In long");//3
	}

	void probe(Long x){
		System.out.println("In Long");
	}

	public static void main(String[] args) {
		Integer a = 4;
		new TestClassExam4().probe(a);

		int b = 4;
		new TestClassExam4().probe(b);
	}
}//it compiles when line is commented out
// it compiles when line 1 is uncommented but line 3 is commented out
// it compiles even when line3 is commented out