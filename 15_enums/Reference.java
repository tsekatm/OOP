package OOP.enums;

public class Reference extends Test{
    int var = 10;
    public int getVar() {
        this.var = super.var2;
        System.out.println(var);
        return var;
    }
    public static void main(String[] args) {
    Reference obj = new Reference();
    obj.getVar();
    }
    Reference(){
        // super();
        this(10);
    }
    Reference(int var){
        this.var = var;
    }

}

class Test{
    int var2 = 100;

}