import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Data4 {
    int value;

    Data4(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }

    public void filterData(ArrayList<Data4> dataList, Predicate<Data4> p) {
        Iterator<Data4> i = dataList.iterator();
        while (i.hasNext()) {
            if (p.test(i.next())) {
                i.remove();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Data4> al = new ArrayList<>(); // Declare and initialize the ArrayList
        Data4 d = new Data4(1);
        al.add(d);
        d = new Data4(2);
        al.add(d);
        d = new Data4(3);
        al.add(d);
        
        Data4 obj = new Data4(0); // Create an instance of Data4 to call the filterData method
        obj.filterData(al, (Data4 x) -> x.value % 2 == 0);
        System.out.println(al);
    }
}