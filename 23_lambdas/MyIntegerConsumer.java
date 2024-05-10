import java.util.function.Consumer;

public class MyIntegerConsumer{
	public static void main(String[] args) {
		
		Consumer <Integer> integerConsumer = message -> System.out.println(message);
		consumeMessage(integerConsumer, 35);
	}
	static Integer consumeMessage(Consumer <Integer> messageConsumer, Integer message){
		messageConsumer.accept(message);
		return message;
	}
}