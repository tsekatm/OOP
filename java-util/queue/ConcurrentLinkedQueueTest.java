import java.util.concurrent.*;

public class ConcurrentLinkedQueueTest{
	public static void main(String[] args) {
		
		ConcurrentLinkedQueue <Integer> queue = new ConcurrentLinkedQueue<>();
		queue.offer(10);
		queue.offer(55);
		queue.offer(1);
		queue.offer(3);

		System.out.println("Removed element: " + queue.poll());
		System.out.println("Remaining elements: " + queue);

	}
}