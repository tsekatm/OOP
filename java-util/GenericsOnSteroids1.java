 import java.util.ArrayList;
import java.util.List;


public class GenericsOnSteroids1 {
	public static void main(String[] args) {
		List<Long> amounts = new ArrayList<>();
		
		amounts.add(new Long(1L));
		amounts.add(new Long(2L));
		amounts.add(new Long(3L));
		amounts.add(new Long(4L));
		
		
		for(int i = 0; i < amounts.size();i++){
			
			Long amount = amounts.get(i);
			System.out.println("Position ["+i+"] amount ["+amount+"]");
		}
	}
}
