
public class MainTest {
    public static void main(String[] args) {
        A objectOfA = new A();
        B objectOfB = new B();
        C  objectOfC1 = new C();
        C objectOfC2 = new C();

        if(objectOfB instanceof A) System.out.println("A");
        if(objectOfC1 instanceof B) System.out.println("B"); 
        if(objectOfC2 instanceof B) System.out.println("C");
        if(objectOfA instanceof B) System.out.println("D"); 
    }
}
