
class LambdaRunnable implements Runnable{
	public void run(){
        for(int i = 0; i < 11; i++){
        	System.out.println("Tebogo");
        }
	}
}

public class LambdaRunnableMain{
	public static void main(String[] args) {
		
		LambdaRunnable runnable = new LambdaRunnable();
		Thread t = new Thread(runnable);
		t.start();
		for(int i = 0; i < 2; i++){
			System.out.println("Main Thread");
		}
	}
}
