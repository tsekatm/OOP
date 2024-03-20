package OOP.constructors;

public class MyClass implements MyInterface{
    int x = 6;
    int y = 8;
    final static int var2 = 10;
    final static String var3 = "10";
    final static double var1 = 20.0;

    public void converter(String input)throws NumberFormatException{
        int var = Integer.parseInt(input);
        System.out.println(var);
    }
    public void doIt(){
        int a = 2;
        System.out.println(this.doIt(this.x, this.y, a));
    }
    public int doIt(int i, int j, int x){
        int a = 4;
        int b = 1;
        System.out.println(doIt(i, j, a, b));
        return (i +j - x)/ a * var2;
    }
    public static int doIt(int i, int j, int x, int y){
        int a = 3;
        return (i + j * x) / a * var2;
    }
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.doIt();
        MyClass myClass2 = new MyClass();
        myClass2.converter(var3);
    }

}
