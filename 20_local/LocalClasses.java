package OOP.local;


public class LocalClasses {
    void display(){
        System.out.println("Hello");
    }
    public LocalClasses(){
        System.out.println("I'm a constructor");
    }
    static int number;

    static{
        number = 10;
    }
    {
        System.out.println("I'm a non-static block");
    }
}
