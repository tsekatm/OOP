import java.util.function.Supplier;

public class MyIntegerSupplier{
	public static void main(String[] args) {
		Supplier <Integer> integerSupplier = () -> 100;
		System.out.println(integerSupplier.get());
	}
}