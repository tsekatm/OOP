import java.util.*;

public class SafeImpl<T extends Money> implements Safe<T>{

	private ArrayList<T> items = new ArrayList<>();

	public int locking(T target){
		items.add(target);
		return items.size();
	}

	public T getFromSafe(int key){
		if(key >= 0 && key < items.size()){
			return items.get(key);
		}
		return null;
	}
	
}