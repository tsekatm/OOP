import java.util.function.Consumer;

public class MyStringConsumer{
	public static void main(String[] args) {
		
		Consumer <String> stringConsumer = message -> System.out.println(message);
		consumeMessage(stringConsumer, "I am a consumer");
	}
	static String consumeMessage(Consumer <String> messageConsumer, String message){
		messageConsumer.accept(message);
		return message;
	}
}