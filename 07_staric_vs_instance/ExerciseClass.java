public class ExerciseClass {
	
	public Inner createInner(){
		System.out.println("I'm an outer constructor");
		return new Inner();
	}
	
	public class Inner{
		public void hi(){
			System.out.println("I'm an inner constructor");

		}
		
	}
}