import java.util.*;

public class Loops{
	public static void main(String[] args) {
		
	// 	int x = 0;
	// 	for(long y = 0, x = 4; x < 5 && y < 10; x++, y++){
	// 		System.out.println(x);
	// 	}//compilation error. x is defined twice


	    List<String> names = new ArrayList<String>();
        int i = 0;
	    names.add("Lisa");
	    names.add("Kevin");
	    names.add("Roger");
	    for(String name : names){
		    System.out.print(name + " ");
	    }

	}

}