import java.util.Collection;
import java.util.Iterator;

public abstract class CollectionTest implements Collection<Object>{

	 int[] arr;
	int size;

	public CollectionTest(){
		arr = new int[10];
		size = 0;
	}
	
	public boolean isEmpty(){
		return true;
	}

	public int size(){
		return size;
	}

	public boolean contains(Object o){
		return false;
	}

	public Iterator<Object> iterator(){
		return null;
	}

	public void clear(){

	}
}