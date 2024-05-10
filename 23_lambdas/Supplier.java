import java.util.function.Supplier;

public class MySupplier {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "I am a supplier";
        System.out.println(stringSupplier.get());
    }
}