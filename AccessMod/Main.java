package OOP.AccessMod;

import OOP.AccessMod.package1.Parent;
import OOP.AccessMod.package2.Child;

public class Main extends Child{
    public Main(String name, int age) {
        super(name, age);
    }
    public static void main(String[] args) {
        myMethod1();
        myMethod2();
        family();
        child();
    }

}
