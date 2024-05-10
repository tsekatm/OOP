import java.util.function.Predicate;

public class MyStringColorTester{
	public static void main(String[] args) {
		Predicate<String> stringColorTester = str -> str.isEmpty();
		boolean isStringEmpty = checkIfStringisEmpty(stringColorTester,"");
		System.out.println(isStringEmpty);
	}

	static boolean checkIfStringisEmpty(Predicate<String> stringPredicate, String str){
		return stringPredicate.test(str);
	}
}