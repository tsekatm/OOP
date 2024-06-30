import java.util.*;

public interface Safe<T extends Money>{

	int locking(T target);
	T getFromSafe(int key);


}