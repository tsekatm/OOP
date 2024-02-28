public class ExerciseClassTest {
	public static void main(String[] args) {
		ExerciseClass outer = new ExerciseClass();
		ExerciseClass.Inner inner = outer.new Inner();

		outer.createInner();
		inner.hi();
	}
}