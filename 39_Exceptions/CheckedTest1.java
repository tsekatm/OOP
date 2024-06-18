public class CheckedTest1 {

	public static int validateAge(int age){
		if(age < 0){
			throw new TebogoException("Tebogo says number is invalid");
		} else if (age > 65) {
			throw new TebogoException("Tebogo says number is invalid");
		}
		return age;
	}

	public static void main(String[] args){

	    validateAge(-1);
	    validateAge(90);
	    validateAge(30);	
	}
}
