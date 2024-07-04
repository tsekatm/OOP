package postmortemFullOOPExams;
import postmortem.A;

public class B extends A{
    B(){}

    public void print(){
    	System.out.println("B");
    }
    public static void main(String[] args) {
    	new B();
    }
}
//not compiling because A() is not public
//cannot be accessed outside the package