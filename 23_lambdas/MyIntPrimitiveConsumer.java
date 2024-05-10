import java.util.function.Consumer;

public class MyIntPrimitiveConsumer{
	public static void main(String[] args) {
		
		Consumer <Integer> intPrimitiveConsumer = message -> System.out.println(message);
		consumeMessage(intPrimitiveConsumer, 35);
	}
	static int consumeMessage(Consumer <Integer> messageConsumer, int message){
		messageConsumer.accept(message);
		return message;
	}
}