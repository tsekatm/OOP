public class TestClass13{
    public static void main(String[] args) {
         TestClass13 x = new TestClass13();
         x.loopTest(0);
    }
    public void loopTest(int x){
    		loop: for(int i = 1; i < 5; i++){
    			for(int j = 1; j < 5; j++){
    				System.out.println("i: " + i);
    				if(x == 0){
    					continue loop;
    				}
    				System.out.println("j: " +j);
    			}
    		}
    	}
}