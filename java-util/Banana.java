import java.util.*;

public class Banana{
	String banana;

    	public Banana(String banana){
            this.banana = banana;
    	}
    public static void main(String[] args) {

    	List<Banana> bananas = new ArrayList<Banana>();

    	bananas.add(new Banana("green banana"));
    	bananas.add(new Banana("yellow banana"));
    	bananas.add(new Banana("brown banana"));
    	bananas.add(new Banana("ripe banana"));

    	Iterator<Banana> iterator = bananas.iterator();
    	while(iterator.hasNext()){
    		Banana banana = iterator.next();
    		System.out.print(banana);
    		if(iterator.hasNext()){
    			System.out.print(", ");
    		}
    	}
    	System.out.println();

    }

    @Override
    public String toString(){
    	return banana;
    }

}