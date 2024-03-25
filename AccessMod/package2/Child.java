package OOP.AccessMod.package2;
import OOP.AccessMod.package1.Parent;

public class Child extends Parent {
    Child obChild = new Child("Child", 5);
    protected static void child(){
        myMethod1();
        System.out.println("I'm a child");
    }
    public static void myFamily(){
        family();
        System.out.println("We are family");
    }
    public Child(String name, int var){
        super(name, var);
        System.out.println("Child constructor");
    }
    public Child(String input, int num, int number){
        super(input, number);
        child();
    }
}
