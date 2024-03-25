package OOP.AccessMod.package1;

public class Parent {

    protected static void family(){
        System.out.println("I am a parent");

    }
    public static void myMethod1(){
        System.out.println("I belong here");
    }
    public static void myMethod2(){

    }
    public Parent(String name, int number) throws  NumberFormatException{
        System.out.println("I'm a parent constructor");
    }

    
}
