import java.util.function.Function;

public class MyLengthFinderFunction{
	public static void main(String[] args) {
		
		Function<String, Integer> lengthFinderFunction = str -> str.length();

		int length = getStringLength(lengthFinderFunction, "FunctionLength");
		System.out.println(length);
	}

	static int getStringLength(Function <String, Integer> lengthFunction, String str){
		return lengthFunction.apply(str);
	}
}