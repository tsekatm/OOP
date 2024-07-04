public class StaticVsInstance00{
	public static void main(String[] args) {
		 Counter counter1 = new Counter();
		 counter1.count();
		 counter1.count();
		 counter1.count();
		 counter1.count();

		 System.out.println("Counter1 is at: " + counter1.getCounter());

		 Counter counter2 = new Counter();
		 counter2.setCounter(100245);

		 counter2.count();
		 counter2.count();
		 counter2.count();
		 counter2.count();
		 System.out.println("Counter2 is at: " +counter2.getCounter());
	}
}

class Counter{
	private int counter;
	public int getCounter(){
		return counter;
	}
	public void setCounter(int counter){
		this.counter = counter;
	}
	public void count(){
		counter++;
	}
}