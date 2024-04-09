 class Display{
 	public void display(){
 		System.out.print("Display.display()");
 	}
 }
 class Monitor extends Display{
 	public long pixelCount(){
 		return 1024 * 768;
 	}
 }
 public class Printer{
 	public static void main(String[] args) {
 		Monitor monitor = new Monitor();
 		Monitor monitor1 = new Monitor();
 		monitor1.display();
 		long pixelCount = monitor.pixelCount();
 		Display display = new Monitor();
 		// long pixelCount = display.pixelCount();
 	}
 }