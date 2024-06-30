import java.util.*;

public class LinkedListSort {
    public static void main(String[] args) {
        List<Long> longList = new LinkedList<>();
        List<Long> synchronizedLongList = Collections.synchronizedList(longList);
        synchronizedLongList.add(2L);
        synchronizedLongList.add(1L);
        synchronizedLongList.add(100L);
        synchronizedLongList.add(45L);
        synchronizedLongList.add(14L);
        
        LinkedListSort arrayListSort = new LinkedListSort();
        List<Long> sortedList = arrayListSort.sort(synchronizedLongList);
        
        System.out.println("Original synchronized list: " + synchronizedLongList);
        System.out.println("Sorted list: " + sortedList);
    }

    public List<Long> sort(List<Long> list) {
        List<Long> sortedList = new LinkedList<>(list);
        Collections.sort(sortedList);
        return sortedList;
    }
}